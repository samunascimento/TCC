package br.ufjf.dcc.gmr.core.vcs.test;

import br.ufjf.dcc.gmr.core.mergenature.controller.GSONClass;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictType;
import br.ufjf.dcc.gmr.core.mergenature.model.DeveloperDecision;
import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Luan
 */
public class TestLuan {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String[] paths = new String[10];
        paths[0] = "/home/luan/Github/TCC/mntrs/freqtrade.mntr";
        paths[1] = "/home/luan/Github/TCC/mntrs/beets.mntr";
        paths[2] = "/home/luan/Github/TCC/mntrs/django.mntr";
        paths[3] = "/home/luan/Github/TCC/mntrs/keras.mntr";
        paths[4] = "/home/luan/Github/TCC/mntrs/lutris.mntr";
        paths[5] = "/home/luan/Github/TCC/mntrs/numpy.mntr";
        paths[6] = "/home/luan/Github/TCC/mntrs/portia.mntr";
        paths[7] = "/home/luan/Github/TCC/mntrs/pandas.mntr";
        paths[8] = "/home/luan/Github/TCC/mntrs/onionshare.mntr";
        paths[9] = "/home/luan/Github/TCC/mntrs/reviewboard.mntr";

        for (int p = 0; p < 10; p++) {
            Project leitorProjeto = GSONClass.readProject(paths[p]);
            int numMerges = leitorProjeto.getNumberOfMerges();
            int numConf = leitorProjeto.getNumberOfConflicts();
            int mergeConflit = leitorProjeto.getNumberOfConflictedMerges();
            int numChunks = leitorProjeto.getNumberOfChunks();

            Map<DeveloperDecision, Integer> solucao = leitorProjeto.getSolucoes();
            Map<ConflictType, Integer> tipoDeConflito = leitorProjeto.getConflictType();

            Map<String, Integer> estruturas = leitorProjeto.getEstruturas();
            Map<String, Integer> dist = leitorProjeto.getChunkDistribution();

            Map<String, ArrayList<Integer>> Lines = leitorProjeto.lineNumberPerVersion();

            //imprime
            System.out.println(paths[p].replace("/home/luan/Github/TCC/mntrs/", ""));
            System.out.println("Merges Totais: " + numMerges);
            System.out.println("Numero de Merges com conflito: " + mergeConflit);
            System.out.println("Numero de Conflitos: " + numConf);
            System.out.println("Numero de chunks: " + numChunks);
            System.out.println("Media de chunks por total de merges: " + ((float) mergeConflit / (float) numMerges));

            System.out.println("--------------- Numero de cada tipo de solução ------------");

            Set teste = solucao.entrySet();
            System.out.println(teste);

            System.out.println("--------------- Numero de cada tipo de conflito ------------");

            Set teste2 = tipoDeConflito.entrySet();
            System.out.println(teste2);

            System.out.println("--------------- Numero da frequência de cada estrutura ------------");

            Set teste3 = estruturas.entrySet();
            System.out.println(teste3);

            Set teste4 = dist.entrySet();
            System.out.println(teste4);

            Set teste5 = Lines.entrySet();
            System.out.println(teste5);

            EstruturasLuan rep = new EstruturasLuan();

            rep.setNumMerges(numMerges);
            rep.setMergeConflit(mergeConflit);
            rep.setNumConf(numConf);
            rep.setNumChunks(numChunks);
            rep.setSolucao(solucao);
            rep.setTipoDeConflito(tipoDeConflito);
            rep.setEstruturas(estruturas);
            rep.setChunkDistribution(dist);
            rep.setLinesNumbers(Lines);

            GSONClass.saveRep(paths[p].replace(".mntr", ".rep"), rep);

        }

    }
}
