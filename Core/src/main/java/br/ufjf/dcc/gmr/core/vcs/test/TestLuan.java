package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import java.io.IOException;
import br.ufjf.dcc.gmr.core.conflictanalysis.controller.RepositoryAnalysis;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 *
 * @author luand
 */
public class TestLuan {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository
     */
    public static void main(String[] args) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        List<SyntaxStructure> analyzeCPPSyntaxTree = RepositoryAnalysis.analyzeCPPSyntaxTree("C:\\Users\\luand.LAPTOP-78V9SGN0\\Documents\\GitHub\\estrutura-de-dados-2\\src\\main.cpp");
        Gson gson = new Gson();
        String JSon = gson.toJson(analyzeCPPSyntaxTree);
        String path=" ";
        createGson(path,JSon);

        

    }
    
    public static void createGson(String path,String save) throws IOException{
        
        
        File myFile = new File(path);
        myFile.createNewFile();
        FileOutputStream fOut = new FileOutputStream(myFile);
        OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
        myOutWriter.append(save);
        myOutWriter.close();
        fOut.close();
        
    }
    /*
    public static Gson readGson(Object typeOfT){
        
        Gson recover=new Gson(); 
        
        // recover on the files
        
     //   recover.fromJson(json, typeOfT);
        
        
    }
*/
}
