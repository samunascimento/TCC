package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.exception.DiffException;
import br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import br.ufjf.dcc.gmr.core.vcs.types.FileDiff;
import br.ufjf.dcc.gmr.core.vcs.types.LineInformation;
import br.ufjf.dcc.gmr.core.vcs.types.LineType;

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

    public static int getLineInAnotherCommit(String directory, String pastCommit, String futureCommit, String file, boolean getFromFuture, int originalLineNumber) throws IOException, NotGitRepositoryException, DiffException {
        return initReturnNewLineNumber(directory,
                (pastCommit == "" || pastCommit == null ? "" : pastCommit + ":") + file,
                (futureCommit == "" || futureCommit == null ? "" : futureCommit + ":") + file,
                getFromFuture,
                originalLineNumber);
    }

    public static int getLineInAnotherCommit(String directory, String pastCommit, String futureCommit, String pastFile, String futureFile, boolean getFromFuture, int originalLineNumber) throws IOException, NotGitRepositoryException, DiffException {
        return initReturnNewLineNumber(directory,
                (pastCommit == "" || pastCommit == null ? "" : pastCommit + ":") + pastFile,
                (futureCommit == "" || futureCommit == null ? "" : futureCommit + ":") + futureFile,
                getFromFuture,
                originalLineNumber);
    }

    private static int initReturnNewLineNumber(String directory, String pastEntity, String futureEntity, boolean getFromFuture, int originalLineNumber) throws IOException, NotGitRepositoryException, DiffException {
        if (originalLineNumber < 0) {
            throw new IOException();
        }
        List<FileDiff> chunks = fillOneFileDiff(directory, pastEntity, futureEntity, getFromFuture);
        if (chunks == null) {
            return REMOVED_FILE;
        } else if (chunks.isEmpty()) {
            return POSTPONED;
        } else {
            int newLineNumber = processingChunkModifiedLine(chunks, originalLineNumber, getFromFuture);
            if (newLineNumber == REMOVED_LINE) {
                return REMOVED_LINE;
            } else {
                return (originalLineNumber + newLineNumber);
            }
        }
    }

    private static List<FileDiff> fillOneFileDiff(String directory, String pastEntity, String futureEntity, boolean getFromFuture) throws IOException, NotGitRepositoryException, DiffException {

        String line;
        int currentLine = 0;
        FileDiff aux = new FileDiff();
        List<FileDiff> chunks = new ArrayList<>();
        List<String> output = Git.auxiliarDiffFile(directory, pastEntity, futureEntity);

        if (output == null) {
            return null;
        } else if (output.isEmpty()) {
            return new ArrayList<>();
        } else {
            for (int i = 0; i < output.size(); i++) {
                line = output.get(i);
                if (line.length() == 0) {
                    continue;
                } else if (line.startsWith("diff --") && currentLine != 0) {
                    chunks.add(aux);
                    aux = new FileDiff();
                } else if ((line.length() == 1 && !(line.charAt(0) == '+' || line.charAt(0) == '-'))) {
                    continue;
                } else if (line.startsWith("+++ ")) {
                    String c = line.substring(5);
                    if (c.endsWith("\t") || c.endsWith("\n")) {
                        c = c.substring(0, c.length() - 1);
                    }
                    aux.setFilePathTarget(c);
                } else if (line.charAt(0) == '+') {
                    String c = line.substring(1);
                    aux.getLines().add(new LineInformation(c, LineType.ADDED, currentLine));
                    if (!getFromFuture) {
                        currentLine++;
                    }
                } else if (line.startsWith("--- ")) {
                    String c = line.substring(5);
                    if (c.endsWith("\t") || c.endsWith("\n")) {
                        c = c.substring(0, c.length() - 1);
                    }
                    aux.setFilePathSource(c);
                } else if (line.charAt(0) == '-') {
                    String c = line.substring(1);
                    aux.getLines().add(new LineInformation(c, LineType.DELETED, currentLine));
                    if (getFromFuture) {
                        currentLine++;
                    }

                } else if (line.startsWith("@@")) {
                    currentLine = startingLineAdapated(line, !getFromFuture);
                }
            }
            chunks.add(aux);
            return chunks;
        }
    }

    public static int startingLineAdapated(String example, boolean getLineOfPlus) {
        String auxString;
        if (example.startsWith("@@@ -")) {
            return -1;
        } else if (getLineOfPlus) {
            auxString = example.split(" ")[2].replaceAll("\\+", "");
        } else {
            auxString = example.split(" ")[1].replaceAll("\\-", "");
        }
        if (auxString.contains(",")) {
            String[] auxArray = auxString.split("\\,");
            if (auxArray[1].equals("0")) {
                return Integer.parseInt(auxArray[0]) + 1;
            } else {
                return Integer.parseInt(auxArray[0]);
            }
        } else {
            return Integer.parseInt(auxString);
        }
    }

    private static int processingChunkModifiedLine(List<FileDiff> chunks, int originalLineNumber, boolean getFromFuture) {
        int j = 0;
        int cont = 0;
        FileDiff chunk = chunks.get(j);
        LineType toAdd = getFromFuture ? LineType.ADDED : LineType.DELETED;
        LineType toRemove = getFromFuture ? LineType.DELETED : LineType.ADDED;
        for (int i = 0; i < chunk.getLines().size(); i++) {
            if (chunk.getLines().get(i).getLineNumber() > originalLineNumber) {
                return cont;
            } else {
                if (chunk.getLines().get(i).getType() == toAdd) {
                    cont++;
                } else if (chunk.getLines().get(i).getType() == toRemove) {
                    if (originalLineNumber == chunk.getLines().get(i).getLineNumber()) {
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
