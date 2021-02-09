package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.exception.EmptyOutput;
import br.ufjf.dcc.gmr.core.exception.ImpossibleLineNumber;
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
import java.io.File;

/**
 * Class created to implement a method to get the Line number of a old archive
 * in a new.
 *
 * @author Luan Reis
 */
public class ReturnNewLineNumber {

    public static final int REMOVED_LINE = -Integer.MAX_VALUE; // Constant used to indentify when a line was removed
    public static final int REMOVED_FILE = -(Integer.MAX_VALUE - 1); // Constant used to indentify when a file was removed
    public static final int POSTPONED = -(Integer.MAX_VALUE - 2);

    /**
     * This method goes trough the diffs between the commit source and the
     * commit target and salve all the information on a created type "FileDiff"
     *
     * @param directory This parameter tells the command the path to the
     * repository we are dealing with
     * @param commitSource This parameter is the commit we want to compare
     * @param commitTarget This parameter is the commit we want to compare to.
     * @return returns a created type "FileDiff" that contains all the
     * information of the diff command.
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository
     * @throws InvalidCommitHash
     */
    private static List<FileDiff> fillFileDiff(String directory, String commitSource, String commitTarget) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash {

        List<FileDiff> chunks = new ArrayList<>();
        List<String> output = new ArrayList<>();

        FileDiff aux = new FileDiff();
        int currentLine = 0;
        output = Git.auxiliarDiff(directory, commitSource, commitTarget);
        String line;
        for (int i = 0; i < output.size(); i++) {
            line = output.get(i);
            if (line.startsWith("diff --") && currentLine != 0) {

                chunks.add(aux);
                aux = new FileDiff();
            }
            if (line.startsWith("diff --") && currentLine != 0) {
                chunks.add(aux);
                aux = new FileDiff();
            }
            if ((line.length() == 1 && !(line.charAt(0) == '+' || line.charAt(0) == '-'))) {
                continue;
            }
            if (line.length() > 2 && line.charAt(0) == '+' && line.charAt(1) == '+' && line.charAt(2) == '+' && line.charAt(3) == ' ') {
                String c = line.substring(5);
                if (c.endsWith("\t") || c.endsWith("\n")) {
                    c = c.substring(0, c.length() - 1);
                }
                aux.setFilePathTarget(c);
            } else if (line.charAt(0) != '-' && (line.charAt(0) == '+' || line.charAt(1) == '+')) {
                String c = line.substring(1);
                aux.getLines().add(new LineInformation(c, LineType.ADDED, currentLine));
            } else if (line.length() > 2 && line.charAt(0) == '-' && line.charAt(1) == '-' && line.charAt(2) == '-' && line.charAt(3) == ' ') {
                String c = line.substring(5);
                if (c.endsWith("\t") || c.endsWith("\n")) {
                    c = c.substring(0, c.length() - 1);
                }
                aux.setFilePathSource(c);
            } else if (line.charAt(0) == '-' || line.charAt(1) == '-') {
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
     * This method goes trough the diffs between the pathSource and the
     * pathTarget and salve all the information on a created type "FileDiff"
     *
     * @param directory This parameter tells the command the path to the
     * repository we are dealing with
     * @param pathSource This parameter is the file we want to compare
     * @param pathTarget This parameter is the file we want to compare to.
     * @return returns a created type "FileDiff" that contains all the
     * information of the diff command.
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository
     * @throws InvalidCommitHash
     */
    private static List<FileDiff> fillOneFileDiff(String directory, String pathSource, String pathTarget) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash, EmptyOutput {

        List<FileDiff> chunks = new ArrayList<>();
        List<String> output = new ArrayList<>();

        FileDiff aux = new FileDiff();
        int currentLine = 0;
        output = Git.auxiliarDiffFile(directory, pathSource, pathTarget);
        if (output == null) {
            return null;
        }
        if (output.isEmpty()) {
            return new ArrayList<>();
        }
        String line;
        for (int i = 0; i < output.size(); i++) {
            line = output.get(i);
            if (line.startsWith("diff --") && currentLine != 0) {

                chunks.add(aux);
                aux = new FileDiff();
            }

            if ((line.length() == 1 && !(line.charAt(0) == '+' || line.charAt(0) == '-'))) {
                continue;
            }
            if (line.length() > 2 && line.charAt(0) == '+' && line.charAt(1) == '+' && line.charAt(2) == '+' && line.charAt(3) == ' ') {
                String c = line.substring(5);
                if (c.endsWith("\t") || c.endsWith("\n")) {
                    c = c.substring(0, c.length() - 1);
                }
                aux.setFilePathTarget(c);
            } else if (line.charAt(0) != '-' && (line.charAt(0) == '+' || line.charAt(1) == '+')) {
                String c = line.substring(1);
                aux.getLines().add(new LineInformation(c, LineType.ADDED, currentLine));
            } else if (line.length() > 2 && line.charAt(0) == '-' && line.charAt(1) == '-' && line.charAt(2) == '-' && line.charAt(3) == ' ') {
                String c = line.substring(5);
                if (c.endsWith("\t") || c.endsWith("\n")) {
                    c = c.substring(0, c.length() - 1);
                }

                aux.setFilePathSource(c);
            } else if (line.charAt(0) == '-' || line.charAt(1) == '-') {
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
     * @param a Line of the diff with the required starting line information.
     * @return The starting line of the diff chunk
     */
    private static int startingLine(String a) {

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
     * Methods that process the FileDiff and returns how much lines were added
     * and removed before an specific number
     *
     * @param chunk Processed diff command in a FileDiff
     * @param originalLineNumber Number of the original line that you want to
     * know in the new
     * @param filePath the path of the archive where the original line was
     * located.
     * @return the difference between added and removed lines on the archive
     * before the original line.
     */
    private static int processingChunkModifiedLine(List<FileDiff> chunk, int originalLineNumber, String filePath) throws PathDontExist {

        int cont = 0;
        int j = 0;

        boolean os = isWindows();

        if (os) {
            for (int i = 0; i < chunk.size(); i++) {
                if (chunk.get(i).getFilePathSource().contains("\\\\")) {
                    String c = windowsPath(chunk.get(i).getFilePathSource());
                    chunk.get(i).setFilePathSource(c);
                }
                if (chunk.get(i).getFilePathTarget().contains("\\\\")) {
                    String c = windowsPath(chunk.get(i).getFilePathTarget());
                    chunk.get(i).setFilePathTarget(c);
                }
            }
        }

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

    private static String windowsPath(String stringPath) {
        String path;
        String[] splitC = stringPath.split(":");
        path = splitC[0].charAt(splitC[0].length() - 1) + ":" + splitC[1];
        path = path.replace("\\\\", "\\").replace("\"", "");
        return path;
    }

    /**
     * Function that runs all the class and returns the original number
     *
     * @param directory This parameter tells the command the path to the
     * repository we are dealing with
     * @param commitSource This parameter is the commit we want to compare
     * @param commitTarget This parameter is the commit we want to compare to.
     * @param originalLineNumber Number of the original line that you want to
     * know in the new
     * @param filePath the path of the archive where the original line was
     * located.
     * @return The number of the "originalLineNumber" on the new file
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository
     * @throws InvalidCommitHash
     * @throws br.ufjf.dcc.gmr.core.exception.PathDontExist
     */
    public static int initReturnNewLineNumber(String directory, String commitSource,
            String commitTarget, int originalLineNumber, String filePath)
            throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash, PathDontExist {

        List<FileDiff> chunks = fillFileDiff(directory, commitSource, commitTarget);
        if (chunks == null) {
            return REMOVED_FILE;
        }
        if (chunks.isEmpty()) {
            return POSTPONED;
        }
        int i;

        i = processingChunkModifiedLine(chunks, originalLineNumber, filePath);

        if (i == REMOVED_LINE) {
            return REMOVED_LINE;
        }

        return originalLineNumber + i;
    }

    /**
     * Function that runs all the class and returns the original number, but it
     * uses the files instead of commits.
     *
     * @param directory This parameter tells the command the path to the
     * repository we are dealing with
     * @param pathSource This parameter is the file we want to compare
     * @param pathTarget This parameter is the file we want to compare to.
     * @param originalLineNumber Number of the original line that you want to
     * know in the new
     * @return The number of the "originalLineNumber" on the new file
     * @throws IOException
     * @throws LocalRepositoryNotAGitRepository
     * @throws InvalidCommitHash
     * @throws br.ufjf.dcc.gmr.core.exception.PathDontExist
     * @throws br.ufjf.dcc.gmr.core.exception.EmptyOutput
     * @throws br.ufjf.dcc.gmr.core.exception.ImpossibleLineNumber
     */
    public static int initReturnNewLineNumberFile(String directory, String pathSource,
            String pathTarget, int originalLineNumber)
            throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash, PathDontExist, EmptyOutput, ImpossibleLineNumber {

        if (originalLineNumber < 0) {
            throw new ImpossibleLineNumber();
        }
        List<FileDiff> chunks = fillOneFileDiff(directory, pathSource, pathTarget);

        if (chunks == null) {
            return REMOVED_FILE;
        }
        if (chunks.isEmpty()) {
            return POSTPONED;
        }
        int i;

        i = processingChunkModifiedLine(chunks, originalLineNumber, pathSource.replace(directory, ""));

        if (i == REMOVED_LINE) {
            return REMOVED_LINE;
        }

        return (originalLineNumber + i);
    }

    private static boolean isWindows() {
        String os = System.getProperty("os.name");
        return os.startsWith("Windows");
    }

    /*-----------------------------*//* Funções Novas Refatoramento*//*----------------------------------------------------*/

    public static int initReturnNewLineNumberAdapted(String directory, String commit,
            String filePath, int originalLineNumber)
            throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash, PathDontExist, EmptyOutput, ImpossibleLineNumber {

        if (originalLineNumber < 0) {
            throw new ImpossibleLineNumber();
        }
        List<FileDiff> chunks = fillOneFileDiffAdapted(directory, commit, filePath);

        if (chunks == null) {
            return REMOVED_FILE;
        }
        if (chunks.isEmpty()) {
            return POSTPONED;
        }
        int i;

        i = processingChunkModifiedLineAdapted(chunks, originalLineNumber, filePath.replace(directory, ""));

        if (i == REMOVED_LINE) {
            return REMOVED_LINE;
        }

        return (originalLineNumber + i);
    }

    private static List<FileDiff> fillOneFileDiffAdapted(String directory, String pathSource, String pathTarget) throws IOException, LocalRepositoryNotAGitRepository, InvalidCommitHash, EmptyOutput {

        List<FileDiff> chunks = new ArrayList<>();
        List<String> output = new ArrayList<>();

        FileDiff aux = new FileDiff();
        int currentLine = 0;
        output = Git.auxiliarDiffFile(directory, pathSource, pathTarget);
        if (output == null) {
            return null;
        }
        if (output.isEmpty()) {
            return new ArrayList<>();
        }
        String line;
        for (int i = 0; i < output.size(); i++) {
            line = output.get(i);
            if (line.startsWith("diff --") && currentLine != 0) {

                chunks.add(aux);
                aux = new FileDiff();
            }

            if ((line.length() == 1 && !(line.charAt(0) == '+' || line.charAt(0) == '-'))) {
                continue;
            }
            if (line.length() > 2 && line.charAt(0) == '+' && line.charAt(1) == '+' && line.charAt(2) == '+' && line.charAt(3) == ' ') {
                String c = line.substring(5);
                if (c.endsWith("\t") || c.endsWith("\n")) {
                    c = c.substring(0, c.length() - 1);
                }
                aux.setFilePathTarget(c);
            } else if (line.charAt(0) != '-' && (line.charAt(0) == '+' || line.charAt(1) == '+')) {
                String c = line.substring(1);
                aux.getLines().add(new LineInformation(c, LineType.ADDED, currentLine));
                currentLine++;
            } else if (line.length() > 2 && line.charAt(0) == '-' && line.charAt(1) == '-' && line.charAt(2) == '-' && line.charAt(3) == ' ') {
                String c = line.substring(5);
                if (c.endsWith("\t") || c.endsWith("\n")) {
                    c = c.substring(0, c.length() - 1);
                }

                aux.setFilePathSource(c);
            } else if (line.charAt(0) == '-' || line.charAt(1) == '-') {
                String c = line.substring(1);
                aux.getLines().add(new LineInformation(c, LineType.DELETED, currentLine));
            } else if (line.charAt(0) == '@' && line.charAt(1) == '@') {
                currentLine = startingLineAdapated(line);
            }

        }
        chunks.add(aux);

        return chunks;
    }

    private static int startingLineAdapated(String a) {

        if (a.charAt(9) == '-') {
            String c[];
            c = a.split("-");
            a = c[1];
            String[] g = null;
            if (a.contains(",") || a.contains("@")) {
                if (a.contains(",")) {
                    g = a.split(",");
                    if (g[0].contains("+")) {
                        g = g[0].split("\\+");
                        g[0] = g[0].replace(" ", "");
                    }
                }
                if (a.contains("@")) {
                    g = a.split("@");
                    if (g[0].contains("+")) {
                        g = g[0].split("\\+");
                        g[0] = g[0].replace(" ", "");
                    }
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
            String g[] = a.split(" @@ ");
            if (g[0].contains(",") || g[0].contains("@")) {
                if (g[0].contains(",")) {
                    g = g[0].split(",");
                    g[0] = g[0].replace(" ", "");
                } else {
                    g = g[0].split("@");
                    g[0] = g[0].replace(" ", "");
                }
            } else {
                g = g[0].split("/+");
            }
            int startingLine;

            startingLine = Integer.parseInt(g[0]);

            return startingLine;

        }
    }

    private static int processingChunkModifiedLineAdapted(List<FileDiff> chunk, int originalLineNumber, String filePath) throws PathDontExist {

        int cont = 0;
        int j = 0;

        boolean os = isWindows();

        if (os) {
            for (int i = 0; i < chunk.size(); i++) {
                if (chunk.get(i).getFilePathSource().contains("\\\\")) {
                    String c = windowsPath(chunk.get(i).getFilePathSource());
                    chunk.get(i).setFilePathSource(c);
                }
                if (chunk.get(i).getFilePathTarget().contains("\\\\")) {
                    String c = windowsPath(chunk.get(i).getFilePathTarget());
                    chunk.get(i).setFilePathTarget(c);
                }
            }
        }

        while (!(chunk.get(j).getFilePathSource().equals("/" + filePath) || chunk.get(j).getFilePathTarget().equals("/" + filePath))) {
            if (j + 1 >= chunk.size()) {
                throw new PathDontExist();
            }
            j++;
        }

        for (int i = 0; i < chunk.get(j).getLines().size(); i++) {

            if (chunk.get(j).getLines().get(i).getLineNumber() > originalLineNumber) {
                return cont;
            } else {
                if (chunk.get(j).getLines().get(i).getType() == LineType.DELETED) {
                    cont++;
                }
                if (chunk.get(j).getLines().get(i).getType() == LineType.ADDED) {

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

}
