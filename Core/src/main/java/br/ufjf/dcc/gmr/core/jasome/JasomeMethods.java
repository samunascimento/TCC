package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.vcs.types.Formats;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.OptionNotExist;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import br.ufjf.dcc.gmr.core.jasome.model.PackageMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.ProjectMetrics;
import br.ufjf.dcc.gmr.core.jasome.model.VersionMetrics;
import br.ufjf.dcc.gmr.core.vcs.Git;
import br.ufjf.dcc.jasome.jdbc.dao.ProjectMetricsDao;
import br.ufjf.dcc.jasome.jdbc.dao.VersionMetricsDao;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gleiph
 */
public class JasomeMethods {

    private String repositoryUrl = null;
    private String repositoryPath = null;
    private String repositoryName = null;
    private String user = null; //usuario github
    private String password = null; //senha github

    private List<String> fileNames = new ArrayList<>();
    private List<String> pathNames = new ArrayList<>();
    private List<String> archiveType = new ArrayList<>();

    private static String repository;
    private static String jasomePath;

    private static final String FILE_PATH = ".".concat(File.separator).concat("thirdparty").concat(File.separator)
            .concat("jasome").concat(File.separator).concat("build").concat(File.separator).concat("distributions")
            .concat(File.separator).concat("jasome").concat(File.separator).concat("bin").concat(File.separator)
            .concat("jasome");

    public JasomeMethods(String repository, String jasome) {
        repositoryPath = repository;
        jasomePath = jasome;
        File projectName = new File(repositoryPath);
        this.repositoryName = projectName.getName();
    }

    public void runProject(ProjectMetrics project, Connection connection) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, NullPointerException, OptionNotExist, RefusingToClean, UnknownSwitch, IsOutsideRepository {
        VersionMetricsDao versionMetricsDao = new VersionMetricsDao(connection);
        VersionMetrics versionMetrics = new VersionMetrics();
        ProjectMetrics projectMetrics = new ProjectMetrics();
//      JasomeExtract jasomeExtract = new JasomeExtract();
        ProjectMetricsDao projectDao = new ProjectMetricsDao(connection);
        List<Integer> idList = new ArrayList<>();
        List<ProjectMetrics> projectNames = new ArrayList<>();
        boolean checkProject = false;
        try {
//            for (int i = 0; i < projectDao.select().size(); i++) {
//                projectNames.add(projectDao.selectID(i + 1));
//                if (project.getName() == projectNames.get(i).getName()) {
//                    project.setId(projectNames.get(i).getId());
//                    checkProject = true;
//                    break;
//                }
//            }
            int i;
            int idPosition;
            int id;
            System.out.println(project.getSourceDir());
            List<Formats> log;
            List<String> parents;

            int projectId = projectDao.insert(project);
            project.setId(projectId);

//            if (checkProject == false) {
                i = 0;
                idPosition = 0;
                log = Git.logAll(project.getSourceDir());
                Collections.reverse(log);
                System.out.println(log.size());
                System.out.println("=================REVs=======================");

//                for (Formats revision : log) {
//                    parents = Git.parent(project.getSourceDir(), revision.getCommitHash());
//                    versionMetrics.setAuthorName(revision.getAuthorName());
//                    versionMetrics.setCommitDate(revision.getAuthorDate());
//                    versionMetrics.setHash(revision.getCommitHash());
//                    versionMetrics.setParentsHash(parents);
//                    int id = versionMetricsDao.insert(versionMetrics);
//                    idList.add(id);
//                }

                for (Formats revision : log) {
                    parents = Git.parent(project.getSourceDir(), revision.getCommitHash());
                    versionMetrics.setAuthorName(revision.getAuthorName());
                    versionMetrics.setCommitDate(revision.getAuthorDate());
                    versionMetrics.setHash(revision.getCommitHash());
                    versionMetrics.setParentsHash(parents);
                    id = versionMetricsDao.insert(versionMetrics);
                    projectMetrics = analyzeVersion(revision, project, i, connection, parents, id);
                    System.out.println("Commit número: " + id);
                    System.out.println(new Date());
                }
//            } else if (checkProject == true) {
//                i = 0;
//                idPosition = 0;
//                log = Git.logAll(project.getSourceDir());
//                Collections.reverse(log);
//                System.out.println(log.size());
//                System.out.println("=================REVs=======================");
//                
//                String hash = projectDao.searchVersion(project.getId());
//                boolean checkHash = false;
//
//                for (Formats revision : log) {
//                    if(hash == revision.getCommitHash()){
//                        checkHash = true;
//                    }
//                    
//                    if(checkHash == true){
//                    parents = Git.parent(project.getSourceDir(), revision.getCommitHash());
//                    projectMetrics = analyzeVersion(revision, project, i, connection, parents, idList.get(idPosition));
//                    System.out.println(new Date());
//                    idPosition++;
//                    }
//                }
//
//            }
        } catch (NullPointerException ex) {
            System.out.println("Fim do arquivo");
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("Não é um repositório válido");
        } catch (IOException ex) {
            System.out.println("Diretorio não existe");
        } catch (SQLException ex) {
            Logger.getLogger(JasomeMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ProjectMetrics analyzeVersion(Formats revision, ProjectMetrics project, int i, Connection connection, List<String> parents, int idPosition) throws IOException, InvalidDocument, RefusingToClean, LocalRepositoryNotAGitRepository, UnknownSwitch, IsOutsideRepository, CheckoutError {
        ProjectMetrics projectMetrics = new ProjectMetrics();
//        JasomeExtract jasomeExtract = new JasomeExtract();
        System.out.println("======================" + revision.getCommitHash() + "==================");
        Git.clean(project.getSourceDir(), true, 3);
        Git.reset(project.getSourceDir(), true, false, false, null);
        Git.checkout(revision.getCommitHash(), project.getSourceDir());
        System.out.println(new Date());
        CLIExecution extractMetrics = extractMetrics(project);
        System.out.println(new Date());
        System.out.println("==============================================");
        ReadXMLUsingSAX readXml = new ReadXMLUsingSAX(project, connection, revision, parents, idPosition);
        readXml.fazerParsing(extractMetrics.getOutputString());
        projectMetrics.getListVersionMetrics().add(readXml.getVersionMetrics());
        try {
            //if (projectMetrics.getListVersionMetrics().get(i).getError()) {
            //    System.out.println("temos um erro nesta versão");
            //}

//            List<PackageMetrics> listPackage = projectMetrics.getListVersionMetrics().get(i).getListPackageMetric();
//            jasomeExtract.extractMetricPackage(projectMetrics, listPackage);
//            jasomeExtract.extractMetricClass(projectMetrics, listPackage);
//            jasomeExtract.extractMetricMethod(projectMetrics, listPackage);
        } finally {
            i++;
        }
        return projectMetrics;
    }

//    public void listJavaArchives(String repositoryPath, File directory, List<String> archiveTypes) throws RepositoryNotFound, ParseException, InvalidDocument, CheckoutError, InvalidDocument {
//        try {
//            int k = 0;
//            ProjectMetrics projectMetrics = new ProjectMetrics();
//            if (directory.isDirectory()) {
//                String[] subDirectory = directory.list();
//                if (subDirectory != null) {
//                    for (String dir : subDirectory) {
//                        listJavaArchives(repositoryPath, new File(directory + File.separator + dir), archiveTypes);
//                    }
//                }
//
//            } else if (directory.isFile() && directory.getAbsoluteFile().toString().endsWith("." + archiveTypes.get(0))) {
//                getFileNames().add(directory.getName().toString());
//                pathNames.add(directory.getAbsoluteFile().toString());
//                System.out.println("adicionando arquivo: " + directory.getName());
//            }
//        } catch (NullPointerException ex) {
//            System.out.println("Fim do arquivo");
//        }
//    }
    public void javaArchivesCount() {
        System.out.println("");
        System.out.println("número de arquivos: " + getFileNames().size());
        System.out.println("");
    }

    public void gitCommands(JasomeMethods jasome, List<Formats> log, int position) throws IOException, UnknownSwitch, RefusingToClean, IsOutsideRepository, LocalRepositoryNotAGitRepository, InvalidDocument, CheckoutError {
        try {
            Git.clean(jasome.GetRepositoryPath(), true, 3);
            Git.reset(jasome.GetRepositoryPath(), true, false, false, null);
            Git.checkout(log.get(position).getCommitHash(), jasome.GetRepositoryPath());
            System.out.println("======================" + log.get(position).getCommitHash() + "==================");
        } catch (UnknownSwitch ex) {
            System.out.println("UnknownSwitch");
        } catch (RefusingToClean ex) {
            System.out.println(ex.getMessage());
        } catch (IsOutsideRepository ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static CLIExecution extractMetrics(ProjectMetrics project) throws IOException {
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            return CLIExecute.executeParallel(jasomePath.concat(".bat").concat(" ").concat("\"").concat(project.getSourceDir()).concat("\""), ".");
        } else {
            return CLIExecute.executeParallel(jasomePath.concat(" ").concat(project.getSourceDir()), ".");
        }
    }

    public static CLIExecution extractMetrics(String path, String pathJasome) throws IOException {
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            return CLIExecute.executeParallel(pathJasome.concat(".bat").concat(" ").concat("\"").concat(path).concat("\""), ".");
        } else {
            return CLIExecute.executeParallel(pathJasome.concat(" ").concat(path), ".");
        }
    }

    public String GetRepositoryPath() {
        return repositoryPath;
    }

    public String GetRepositoryName() {
        return repositoryName;
    }

    /**
     * @return the archiveType
     */
    public List<String> getArchiveType() {
        return archiveType;
    }

    /**
     * @param archiveType the archiveType to set
     */
    public void setArchiveType(List<String> archiveType) {
        this.archiveType = archiveType;
    }

    /**
     * @return the fileNames
     */
    public List<String> getFileNames() {
        return fileNames;
    }
    /**
     * @param fileNames the fileNames to set
     */
}
