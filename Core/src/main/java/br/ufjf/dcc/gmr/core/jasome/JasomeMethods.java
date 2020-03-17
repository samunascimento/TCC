package br.ufjf.dcc.gmr.core.jasome;

import br.ufjf.dcc.gmr.core.cli.CLIExecute;
import br.ufjf.dcc.gmr.core.cli.CLIExecution;
import br.ufjf.dcc.gmr.core.vcs.types.Formats;
import br.ufjf.dcc.gmr.core.exception.CheckoutError;
import br.ufjf.dcc.gmr.core.exception.InvalidDocument;
import br.ufjf.dcc.gmr.core.exception.IsOutsideRepository;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.RefusingToClean;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UnknownSwitch;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gleiph
 */
public class JasomeMethods {

    private String repositoryUrl = null; //url do repositório remoto
    private String repositoryPath = null;
    private String repositoryName = null;  //nome da pasta a ser criada e não pode ter espaço no nome
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
    }

    public void checkRepository() throws RepositoryNotFound, UrlNotFound {
        if ((repositoryUrl != null && repositoryUrl.startsWith("https://github.com/")) && (repositoryName != null && !repositoryName.contains(" ")) && (user == null || password == null)) {
            Git.clone(repositoryUrl, repositoryPath, repositoryName);
            repositoryPath = repositoryPath.concat("\\").concat(repositoryName);
        } else if ((repositoryUrl != null && repositoryUrl.startsWith("https://github.com/")) && (repositoryName != null && !repositoryName.contains(" ")) && user != null && password != null) {
            Git.clone(repositoryUrl, repositoryPath, repositoryName, user, password);
            repositoryPath = repositoryPath.concat("\\").concat(repositoryName);
        }
    }

    public String GetRepositoryPath() {
        return repositoryPath;
    }

    public void runProject(String repositoryPath) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, NullPointerException {
        ProjectMetrics projectMetrics = new ProjectMetrics();
        JasomeExtract jasomeExtract = new JasomeExtract();
        try {
            int i = 0;
            System.out.println(repositoryPath);
            List<Formats> log = Git.logAll(repositoryPath);
            System.out.println(log.size());
            System.out.println("=================REVs=======================");
            for (Formats revision : log) {
                System.out.println("======================" + revision.getCommitHash() + "==================");
                Git.clean(repositoryPath, true, 3);
                Git.reset(repositoryPath, true, false, false, null);
                Git.checkout(revision.getCommitHash(), repositoryPath);
                System.out.println(new Date());
                CLIExecution extractMetrics = extractMetrics(repositoryPath);
                System.out.println(new Date());
                System.out.println("==============================================");
                ReadXMLUsingSAX readXml = new ReadXMLUsingSAX();
                readXml.fazerParsing(extractMetrics.getOutputString());
                projectMetrics.getListVersionMetrics().add(readXml.getVersionMetrics());
                if (extractMetrics.getError() != null && !extractMetrics.getError().isEmpty()) {
                    projectMetrics.getListVersionMetrics().get(i).setError(true);
                }
                try {
                    //if (projectMetrics.getListVersionMetrics().get(i).getError()) {
                    //    System.out.println("temos um erro nesta versão");
                    //}
                    printMetrics(projectMetrics, i);

                    List<PackageMetrics> listPackage = projectMetrics.getListVersionMetrics().get(i).getListPackageMetric();
                    jasomeExtract.extractMetricPackage(projectMetrics, listPackage);
                    jasomeExtract.extractMetricClass(projectMetrics, listPackage);
                    jasomeExtract.extractMetricMethod(projectMetrics, listPackage);
                } finally {
                    System.out.println("Commit numero :" + i);
                    i++;
                }

                System.out.println(new Date());

            }
        } catch (NullPointerException ex) {
            System.out.println("Fim do arquivo");
        } catch (LocalRepositoryNotAGitRepository ex) {
            System.out.println("Não é um repositório válido");
        } catch (IOException ex) {
            System.out.println("Diretorio não existe");
        } catch (UnknownSwitch ex) {
            System.out.println("UnknownSwitch");
        } catch (RefusingToClean ex) {
            System.out.println(ex.getMessage());
        } catch (IsOutsideRepository ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printMetrics(ProjectMetrics projectMetrics,int version) {
        System.out.println("Project: TLOC = " + projectMetrics.getListVersionMetrics().get(version).getTloc().getValue());
        System.out.println("Package: Number of Classes = " + projectMetrics.getListVersionMetrics().get(version).getListPackageMetric().get(0).getNoc().getValue());
        System.out.println("Class: Number of Methods = " + projectMetrics.getListVersionMetrics().get(version).getListPackageMetric().get(0).getListClassMetrics().get(0).getMa().getValue());
        System.out.println("Method : Number of Parametes = " + projectMetrics.getListVersionMetrics().get(version).getListPackageMetric().get(0).getListClassMetrics().get(0).getListMethodsMetrics().get(0).getNop().getValue());

    }

    public void runJasome(String repositoryPath, List files, List paths, int numberCommit) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, NullPointerException {
        ProjectMetrics projectMetrics = new ProjectMetrics();
        JasomeExtract jasomeExtract = new JasomeExtract();
        try {
            int i = 0;
            System.out.println("=================REVs=======================");
            for (int k = 0; k < getFileNames().size(); k++) {
                System.out.println("======================" + files.get(i).toString() + "==================");
                CLIExecution extractMetrics = extractMetrics(paths.get(k).toString());
                System.out.println(new Date());
                System.out.println("==============================================");
                ReadXMLUsingSAX readXml = new ReadXMLUsingSAX();
                readXml.fazerParsing(extractMetrics.getOutputString());
                projectMetrics.getListVersionMetrics().add(readXml.getVersionMetrics());
                if (extractMetrics.getError() != null && !extractMetrics.getError().isEmpty()) {
                    projectMetrics.getListVersionMetrics().get(i).setError(true);
                }
                try {
                    if (projectMetrics.getListVersionMetrics().get(i).getError()) {
                        System.out.println("temos um erro no diretório: " + paths.get(i).toString());
                    }
                    System.out.println("TLOC = " + projectMetrics.getListVersionMetrics().get(i).getTloc().getValue());

                    List<PackageMetrics> listPackage = projectMetrics.getListVersionMetrics().get(i).getListPackageMetric();
                    jasomeExtract.extractMetricPackage(projectMetrics, listPackage);
                    jasomeExtract.extractMetricClass(projectMetrics, listPackage);
                    jasomeExtract.extractMetricMethod(projectMetrics, listPackage);
                } finally {
                    System.out.println("Commit numero :" + numberCommit);
                    i++;
                }

                System.out.println(new Date());

            }
        } catch (NullPointerException ex) {
            System.out.println("Fim do arquivo");
        } catch (IOException ex) {
            System.out.println("Diretorio não existe");
        }
    }

    public void listJavaArchives(String repositoryPath, File directory, List<String> archiveTypes) throws RepositoryNotFound, ParseException, InvalidDocument, CheckoutError, InvalidDocument {
        try {
            int k = 0;
            ProjectMetrics projectMetrics = new ProjectMetrics();
            if (directory.isDirectory()) {
                String[] subDirectory = directory.list();
                if (subDirectory != null) {
                    for (String dir : subDirectory) {
                        listJavaArchives(repositoryPath, new File(directory + File.separator + dir), archiveTypes);
                    }
                }

            } else if (directory.isFile() && directory.getAbsoluteFile().toString().endsWith("." + archiveTypes.get(0))) {
                getFileNames().add(directory.getName().toString());
                pathNames.add(directory.getAbsoluteFile().toString());
                System.out.println("adicionando arquivo: " + directory.getName());
            }
        } catch (NullPointerException ex) {
            System.out.println("Fim do arquivo");
        }
    }

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

    public static CLIExecution extractMetrics(String path) throws IOException {
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            return CLIExecute.executeParallel(jasomePath.concat(".bat").concat(" ").concat("\"").concat(path).concat("\""), ".");
        } else {
            return CLIExecute.executeParallel(jasomePath.concat(" ").concat(path), ".");
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
