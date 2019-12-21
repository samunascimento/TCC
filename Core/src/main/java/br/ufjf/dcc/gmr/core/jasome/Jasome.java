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

/**
 *
 * @author gleiph
 */
public class Jasome {

    private static final String FILE_PATH = ".".concat(File.separator).concat("thirdparty").concat(File.separator)
            .concat("jasome").concat(File.separator).concat("build").concat(File.separator).concat("distributions")
            .concat(File.separator).concat("jasome").concat(File.separator).concat("bin").concat(File.separator)
            .concat("jasome");

    public static void main(String[] args) throws LocalRepositoryNotAGitRepository, CheckoutError, ParseException, InvalidDocument, RepositoryNotFound, UrlNotFound {

        ProjectMetrics projectMetrics = new ProjectMetrics();
        try {
            int i = 0;
            String repositoryUrl = null; //url do repositório remoto
            String repositoryPath = "C:\\Users\\anton\\Desktop\\projeto-exemplo";
            String repositoryName = null;  //nome da pasta a ser criada e não pode ter espaço no nome
            String user = null; //usuario github
            String password = null; //senha github
            if ((repositoryUrl != null && repositoryUrl.startsWith("https://github.com/")) && (repositoryName != null && !repositoryName.contains(" ")) && user == null && password == null) {
                Git.clone(repositoryUrl, repositoryPath, repositoryName);
                repositoryPath = repositoryPath.concat("\\").concat(repositoryName);
            } else if ((repositoryUrl != null && repositoryUrl.startsWith("https://github.com/")) && (repositoryName != null && !repositoryName.contains(" ")) && user != null && password != null) {
                Git.clone(repositoryUrl, repositoryPath, repositoryName, user, password);
                repositoryPath = repositoryPath.concat("\\").concat(repositoryName);
            }
            System.out.println(repositoryPath);
            List<Formats> log = Git.logAll(repositoryPath);
            System.out.println(log.size());
            System.out.println("=================REVs=======================");
            for (Formats revision : log) {

                if (revision.getCommitHash().startsWith("fc36d40f")) {
                    System.out.println("Aqui");
                }

                System.out.println("======================" + revision.getCommitHash() + "==================");
                Git.clean(repositoryPath, true, 3);
                Git.reset(repositoryPath, true, false, false, null);
                Git.checkout(revision.getCommitHash(), repositoryPath);

                System.out.println(new Date());

                CLIExecution extractMetrics = extractMetrics(repositoryPath);
                System.out.println("==============================================");
                ReadXMLUsingSAX readXml = new ReadXMLUsingSAX();
                readXml.fazerParsing(extractMetrics.getOutputString());
                projectMetrics.getListVersionMetrics().add(readXml.getVersionMetrics());
                if (extractMetrics.getError() != null && !extractMetrics.getError().isEmpty()) {
                    projectMetrics.getListVersionMetrics().get(i).setError(true);
                }
                try {
                    if (projectMetrics.getListVersionMetrics().get(i).getError()) {
                        System.out.println("temos um erro nesta versão");
                    }

                    List<PackageMetrics> listPackage = projectMetrics.getListVersionMetrics().get(i).getListPackageMetric();
                    //filtrando pacotes
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
                    //fim
                    //Filtrabdo por classe
                    //Irei refator tudo isso depois
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
                    //fim
                    
                    //Filtrando por método
                    boolean contemMetodo = false;
                    for(int j=0;j<listPackage.size();j++){
                        for(int y=0;y<listPackage.get(j).getListClassMetrics().size();y++){
                            for(int w=0;w<listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().size();w++){
                                if(projectMetrics.getListMethodMetrics().size() == 0){
                                    projectMetrics.getListMethodMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()).concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().get(w).getName()));
                                }else{
                                    for(int x=0;x<projectMetrics.getListMethodMetrics().size();x++){
                                        if(projectMetrics.getListMethodMetrics().get(x).equals(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()).concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().get(w).getName()))){
                                            contemMetodo = true;
                                        }
                                    }
                                    if(contemMetodo == false){
                                        projectMetrics.getListMethodMetrics().add(listPackage.get(j).getName().concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getName()).concat(".").concat(listPackage.get(j).getListClassMetrics().get(y).getListMethodsMetrics().get(w).getName()));
                                    }
                                }
                            }
                        }
                    }
                    
                    
                    //fim

                } //catch (Exception e) {
                //System.out.println("for está lançando exceção(consertar)");
                finally {
                    System.out.println("Commit numero :" + i);
                    i++;
                }

                System.out.println(new Date());

            }
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

        //projectMetrics.getNamePackageMetrics();
        //projectMetrics.getNameClassMetrics();
        projectMetrics.getNameMethodMetrics();
        //List<PackageMetrics>listPack = projectMetrics.getMetricPackage("dsoo.jogo.rpg.combate");
    }

    public static CLIExecution extractMetrics(String path) throws IOException {
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            return CLIExecute.execute(FILE_PATH.concat(".bat").concat(" ").concat("\"").concat(path).concat("\""), ".");
        } else {
            return CLIExecute.execute(FILE_PATH.concat(" ").concat(path), ".");
        }
    }

}
