package br.ufjf.dcc.gmr.core.vcs.example;

import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.exception.UrlNotFound;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gleiph
 */
public class GitExample {

    public static void main(String[] args) throws IOException, RepositoryNotFound, UrlNotFound{
        String repositoryPath = "C:\\Users\\antonio henrique\\Documents\\simplegit-progit";

        /*String url, directory, name;
        Scanner input = new Scanner(System.in);
        System.out.print("Url: ");
        url = input.nextLine();
        System.out.print("Directory: ");
        directory = input.nextLine();
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Deseja login e senha? (S ou N)");
        String op = input.nextLine();
        
        if(op.equals("S") || op.equals("s")){
            System.out.print("Login: ");
            String login = input.nextLine();
            System.out.print("Senha: ");
            String senha = input.nextLine();
            Git.clone(url, directory, name, login, senha);
        }else{
            Git.clone(url, directory, name);     
        }
        System.out.println("Status: ");
        Git.status(directory);
        */
        List<Formats> list = new ArrayList<>();
        list = Git.log(repositoryPath);
        for(int i=0;i<list.size(); i++){
            System.out.println(
                    list.get(i).getAuthorName()+ " " + 
                    list.get(i).getCommitHash() + " " +
                    list.get(i).getAuthorDate() + " " +
                    list.get(i).getCommitDescription()
            );
        }
    }

    /**
     * @deprecated 
     * @param command
     * @param repositoryPath
     * @throws IOException
     */
    public static void execute(String command, String repositoryPath) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process exec = runtime.exec(command, null,
                new File(repositoryPath));

        String s;

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(exec.getInputStream()));

        BufferedReader stdError = new BufferedReader(new InputStreamReader(exec.getErrorStream()));

        // read the output from the command
        System.out.println("==================Saida============================");
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }

        // read any errors from the attempted command
        System.out.println("==================Erro============================");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }
}
