package br.ufjf.dcc.gmr.core.principal;

import br.ufjf.dcc.gmr.core.cli.Formats;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Conflits {
    
    public static void getConflit(String repository){
        List <String> merge = new ArrayList<>();
        merge = Git.logSimple(repository);
        List <String> output = new ArrayList<>();
        output = Git.logSimple(repository);
        String pais[][] = new String[merge.size()][merge.size()];
        for(String m: merge){
            System.err.println(m);
        }
    }
    
}
