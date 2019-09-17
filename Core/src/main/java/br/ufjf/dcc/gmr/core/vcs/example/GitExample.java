package br.ufjf.dcc.gmr.core.vcs.example;

import br.ufjf.dcc.gmr.core.exception.RepositoryNotFound;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gleiph
 */
public class GitExample {

    public static void main(String[] args) throws IOException {

        String url = "456578658767";
        String directory = "/Users/gleiph/Dropbox/UFJF/repositorios/sandbox";
        
        try {
            Git.gitClone(url, directory);
        } catch (RepositoryNotFound ex) {
            System.out.println("Repositório definido não foi encontrado...");
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
