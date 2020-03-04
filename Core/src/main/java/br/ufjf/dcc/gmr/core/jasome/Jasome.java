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
public class Jasome {

    private String repositoryUrl = null; //url do repositório remoto
    private String repositoryPath = "C:\\Users\\anton\\Desktop\\projeto-exemplo";
    private String repositoryName = null;  //nome da pasta a ser criada e não pode ter espaço no nome
    private String user = null; //usuario github
    private String password = null; //senha github
    
    private static List<String> fileNames = new ArrayList<>();
    private static List<String> pathNames = new ArrayList<>();
    
    private static String repository;
    
    private static final String FILE_PATH = ".".concat(File.separator).concat("thirdparty").concat(File.separator)
            .concat("jasome").concat(File.separator).concat("build").concat(File.separator).concat("distributions")
            .concat(File.separator).concat("jasome").concat(File.separator).concat("bin").concat(File.separator)
            .concat("jasome");

    public Jasome(String repository) {
        repositoryPath = repository;
    }

    public void CheckRepository() throws RepositoryNotFound, UrlNotFound{
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
    
    
    public void ExtractClassMetrics(String repositoryPath, List files, List paths, Formats revision,int x) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, NullPointerException{
        ProjectMetrics projectMetrics = new ProjectMetrics();
        try {          
            int i = 0;
            System.out.println(repositoryPath);
            System.out.println("=================REVs=======================");
            for (int k = 0 ; k < files.size(); k++) {
                System.out.println("======================" + files.get(i).toString() + "==================");
                Git.clean(repositoryPath, true, 3);
                Git.reset(repositoryPath, true, false, false, null);
                Git.checkout(revision.getCommitHash(), repositoryPath);
                
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
                    System.out.println("TLOC = "+ projectMetrics.getListVersionMetrics().get(i).getTloc().getValue());

                    List<PackageMetrics> listPackage = projectMetrics.getListVersionMetrics().get(i).getListPackageMetric();
                    ExtractMetricPackage(projectMetrics, listPackage);
                    ExtractMetricClass(projectMetrics, listPackage);
                    ExtractMetricMethod(projectMetrics, listPackage);
                }
                finally {
                    System.out.println("Commit numero :" + x);
                    i++;
                }

                System.out.println(new Date());

            }
        }catch (NullPointerException ex) {
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
    
    public void ExtractMetricClass(ProjectMetrics projectMetrics, List<PackageMetrics> listPackage) {
        boolean contemClass = false;
        for (int j = 0; j < listPackage.size(); j++) {
            for (int y = 0; y < listPackage.get(j).getListClassMetrics().size(); y++) {
                if (projectMetrics.getListClassMetrics().size() == 0) {
                    projectMetrics.getListClassMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()));
                    //System.out.println(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()));
                } else {
                    for (int w = 0; w < projectMetrics.getListClassMetrics().size(); w++) {
                        if (projectMetrics.getListClassMetrics().get(w).equals(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()))) {
                            contemClass = true;
                        }
                    }
                    if (contemClass == false) {
                        projectMetrics.getListClassMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()));
                    }
                    //System.out.println(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()));
                }
            }
        }
    }

    public void ExtractMetricPackage(ProjectMetrics projectMetrics, List<PackageMetrics> listPackage) {
        boolean contemPackage = false;
        for (int j = 0; j < listPackage.size(); j++) {
            if (projectMetrics.getListPackageMetrics().size() == 0) {
                projectMetrics.getListPackageMetrics().add(listPackage.get(j).getName());
            } else {
                for (int y = 0; y < projectMetrics.getListPackageMetrics().size(); y++) {
                    if (projectMetrics.getListPackageMetrics().get(y).equals(listPackage.get(j).getName())) {
                        contemPackage = true;
                    }
                }
                if (contemPackage == false) {
                    projectMetrics.getListPackageMetrics().add(listPackage.get(j).getName()); //está acessando espaço de memoria inválido
                }
            }
        }
    }
    
    public void ExtractMetricMethod(ProjectMetrics projectMetrics, List<PackageMetrics> listPackage) {
        boolean contemMetodo = false;
        for (int j = 0; j < listPackage.size(); j++) {
            for (int y = 0; y < listPackage.get(j).getListClassMetrics().size(); y++) {
                for (int w = 0; w < listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().size(); w++) {
                    if (projectMetrics.getListMethodMetrics().size() == 0) {
                        projectMetrics.getListMethodMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()).concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().get(w).getName()));
                    } else {
                        for (int x = 0; x < projectMetrics.getListMethodMetrics().size(); x++) {
                            if (projectMetrics.getListMethodMetrics().get(x).equals(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()).concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().get(w).getName()))) {
                                contemMetodo = true;
                            }
                        }
                        if (contemMetodo == false) {
                            projectMetrics.getListMethodMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()).concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().get(w).getName()));
                        }
                    }
                }
            }
        }
    }

    public void ReadFilter(ProjectMetrics projectMetrics) {
        Scanner ler = new Scanner(System.in);
        String filterMetric;
        while (true) {
            System.out.println("PACKAGE|CLASS|METHOD");
            filterMetric = ler.next();
            switch (filterMetric) {
                case "PACKAGE":
                    projectMetrics.getNamePackageMetrics();
                    String namePackage;
                    namePackage = ler.next();
                    List<PackageMetrics> listPack = new ArrayList<>();
                    listPack = projectMetrics.getMetricPackage(namePackage);
                    for (int i = 0; i < listPack.size(); i++) {
                        System.out.println(listPack.get(i));
                    }
                    break;
                case "CLASS":
                    projectMetrics.getNameClassMetrics();
                    String nameClass;
                    nameClass = ler.next();
                    List<ClassMetrics> listClass = new ArrayList<>();
                    listClass = projectMetrics.getMetricClass(nameClass);
                    for (int i = 0; i < listClass.size(); i++) {
                        System.out.println(listClass.get(i));
                    }
                    break;
                case "METHOD":
                    projectMetrics.getNameMethodMetrics();
                    String nameMethod;
                    nameMethod = ler.next();
                    List<MethodMetrics> listMethod = new ArrayList<>();
                    listMethod = projectMetrics.getMetricMethod(nameMethod);
                    for (int i = 0; i < listMethod.size(); i++) {
                        System.out.println(listMethod.get(i));
                    }
                    break;
                default:
                    System.out.println("teste");

            }
        }

    }
    
    public void ListJavaArchives(String repositoryPath, File directory, Formats revision) throws RepositoryNotFound, ParseException, InvalidDocument, CheckoutError, InvalidDocument {
        try {
            int k=0;
            ProjectMetrics projectMetrics = new ProjectMetrics();
            if (directory.isDirectory()) {
                String[] subDirectory = directory.list();
                if (subDirectory != null) {
                    for (String dir : subDirectory) {
                        ListJavaArchives(repositoryPath, new File(directory + File.separator + dir), revision);
                    }
                }
                
            } else if (directory.isFile() && directory.getAbsoluteFile().toString().endsWith(".java")) {
                fileNames.add(directory.getName().toString());
                pathNames.add(directory.getAbsoluteFile().toString());
                System.out.println("adicionando arquivo: " + directory.getName());
            }
        } catch (NullPointerException ex) {
            System.out.println("Fim do arquivo");
        } 
    }

 public void RunListJavaArchives(String repositoryPath) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, NullPointerException {
        File directory = new File(repositoryPath);
        System.out.println(repositoryPath);
        List<Formats> log = Git.logAll(repositoryPath);
        List<Formats> revision = new ArrayList<>();
        System.out.println(log.size());
        System.out.println("=================REVs=======================");
        revision.add(log.get(0));  
        ListJavaArchives(repositoryPath, directory, revision.get(0));
    }
 
  public void RunJasome (String repositoryPath,List files, List paths) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError, NullPointerException {
        File directory = new File(repositoryPath);
        System.out.println(repositoryPath);
        List<Formats> log = Git.logAll(repositoryPath);
        List<Formats> revision = new ArrayList<>();
        System.out.println(log.size());

        for (int i = 0; i < log.size(); i++) {
            revision.add(log.get(i));
            System.out.println("");
            System.out.println("");
            System.out.println("======================" + revision.get(i).getCommitHash() + "==================");
            ExtractClassMetrics(repositoryPath, files,paths, revision.get(i),i);
    }
  }
     public static CLIExecution extractMetrics(String path) throws IOException {
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            return CLIExecute.execute(FILE_PATH.concat(".bat").concat(" ").concat("\"").concat(path).concat("\""), ".");
        } else {
            return CLIExecute.execute(FILE_PATH.concat(" ").concat(path), ".");
        }
    }
    
    public static CLIExecution extractMetrics(String path, String pathJasome) throws IOException {
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            return CLIExecute.execute(pathJasome.concat(".bat").concat(" ").concat("\"").concat(path).concat("\""), ".");
        } else {
            return CLIExecute.execute(pathJasome.concat(" ").concat(path), ".");
        }
    } 
     
    public static void main(String[] args) throws IOException, RepositoryNotFound, LocalRepositoryNotAGitRepository, ParseException, InvalidDocument, CheckoutError{
        Jasome jasome = new Jasome("C:\\Users\\Principal\\Desktop\\teste\\UFJF\\Core");
        jasome.RunListJavaArchives(jasome.GetRepositoryPath());
        for(int k = 0; k < fileNames.size(); k++){
            jasome.RunJasome(jasome.GetRepositoryPath(),fileNames,pathNames);
        }
    }
}
