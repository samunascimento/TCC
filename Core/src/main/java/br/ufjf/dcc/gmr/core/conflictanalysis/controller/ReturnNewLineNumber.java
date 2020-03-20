package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.exception.InvalidCommitHash;
import br.ufjf.dcc.gmr.core.exception.LocalRepositoryNotAGitRepository;
import br.ufjf.dcc.gmr.core.exception.PathDontExist;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import br.ufjf.dcc.gmr.core.vcs.types.LineType;

/**
 * Class created to implete a method to get the Line number of a old archieve in
 * a new.
 *
 * @author Luan Reis
 */
public class ReturnNewLineNumber {

    public static final int REMOVED_LINE = -Integer.MAX_VALUE;

    /**
     * Description: Constructor, initializate the array.
     *
     */
    /**
     * This method goes trough the diffs between the commit source and the
     * commit target and salve all the informations on a created type "FileDiff"
     *
     * @param directory This parameter tells the command the path to the
     * repository we are dealling with
     * @param commitSource This parameter is the commit we want to compare
     * @param commitTarget This parameter is the commit we want to compare to.
     * @return returns a created type "FileDiff" that contains all the
     * information of the diff command.
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository
     * @throws InvalidCommitHash
     */
    private List<FileDiff> fillFileDiff(String directory, String commitSource, String commitTarget) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        List<FileDiff> chunks = new ArrayList<>();
        List<String> output = new ArrayList<>();

        FileDiff aux = new FileDiff();
        int currentLine = 0;
        output = Git.auxiliardiff(directory, commitSource, commitTarget);
        String line;
        for (int i = 0; i < output.size(); i++) {
            line = output.get(i);
            if (line.startsWith("diff --") && currentLine != 0) {

                chunks.add(aux);
                aux = new FileDiff();
            }
            if (line.length() > 2 && line.charAt(0) == '+' && line.charAt(1) == '+' && line.charAt(2) == '+') {
                String c = line.substring(5);
                aux.setFilePathTarget(c);
            } else if (line.charAt(0) == '+') {
                String c = line.substring(1);
                aux.getLines().add(new LineInformation(c, LineType.ADDED, currentLine));
            } else if (line.length() > 2 && line.charAt(0) == '-' && line.charAt(1) == '-' && line.charAt(2) == '-' && line.length() > 5) {
                String c = line.substring(5);
                aux.setFilePathSource(c);
            } else if (line.charAt(0) == '-') {
                String c = line.substring(1);
                aux.getLines().add(new LineInformation(c, LineType.DELETED, currentLine));
                currentLine++;
            } else if (line.charAt(0) == '@' && line.charAt(1) == '@') {
                currentLine = startingLine(line);
            }

        }
        chunks.add(aux);
        
        return chunks;
    }

    /**
     * Method used by "fillFileDiff" to read the diff output and get the
     * starting line of the chunk.
     *
     * @param a Line of the diff with the required starting line informations.
     * @return The starting line of the diff chunk
     */
    private int startingLine(String a) {

        if (a.contains("-")) {
            String c[];
            c = a.split("-");
            a = c[1];
            String g[];
            if (a.contains(",")) {
                g = a.split(",");
                if (g[0].contains("+")) {
                    g = g[0].split("\\+");
                    g[0] = g[0].replace(" ", "");
                }
            } else {
                g = a.split("\\+");
                g[0] = g[0].replace(" ", "");
            }
            int startingLine;
            startingLine = Integer.parseInt(g[0]);

            return startingLine;
        } else {
            String c[];
            c = a.split("\\+");
            a = c[1];
            String g[];
            if (a.contains(",")) {
                g = a.split(",");
            } else {
                g = a.split("/+");
            }
            int startingLine;
            startingLine = Integer.parseInt(g[0]);

            return startingLine;

        }
    }

    /**
     * Methos that process the FileDiff and returns how much lines were added
     * and removed before an specific number
     *
     * @param chunk Processed diff command in a FileDiff
     * @param originalLineNumber Number of the original line that you want to
     * know in the new
     * @param filePath the path of the archieve where the original line was
     * located.
     * @return the difference between added and removed lines on the archieve
     * before the original line.
     */
    private int processingChunkModifiedLine(List<FileDiff> chunk, int originalLineNumber, String filePath) throws PathDontExist {

        int cont = 0;
        int j = 0;

        while (!chunk.get(j).getFilePathSource().equals(filePath)) {
            if (j + 1 >= chunk.size()) {
                throw new PathDontExist();
            }
            j++;

        }

        for (int i = 0; i < chunk.get(j).getLines().size(); i++) {

            if (chunk.get(j).getLines().get(i).getLineNumber() > originalLineNumber) {
                return cont;
            } else {
                if (chunk.get(j).getLines().get(i).getType() == LineType.ADDED) {
                    cont++;
                }
                if (chunk.get(j).getLines().get(i).getType() == LineType.DELETED) {

                    if (originalLineNumber == chunk.get(j).getLines().get(i).getLineNumber()) {
                        return REMOVED_LINE;
                    } else {
                        cont--;
                    }
                }
            }
        }

        return cont;
    }

    /**
     * Public method that call the private ones and return the final number
     *
     * @param directory This parameter tells the command the path to the
     * repository we are dealling with
     * @param commitSource This parameter is the commit we want to compare
     * @param commitTarget This parameter is the commit we want to compare to.
     * @param originalLineNumber Number of the original line that you want to
     * know in the new
     * @param filePath the path of the archieve where the original line was
     * located.
     * @return The number of the "originalLineNumber" on the new file
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository
     * @throws InvalidCommitHash
     * @throws br.ufjf.dcc.gmr.core.exception.PathDontExist
     */
    public int initreturnNewLineNumber(String directory, String commitSource,
            String commitTarget, int originalLineNumber, String filePath)
            throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash, PathDontExist {

        List<FileDiff> chunks = fillFileDiff(directory, commitSource, commitTarget);
        int i;

        i = processingChunkModifiedLine(chunks, originalLineNumber, filePath);

        if (i == REMOVED_LINE) {
            return REMOVED_LINE;
        }

        return originalLineNumber + i;
    }

}
