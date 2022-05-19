package br.ufjf.dcc.gmr.core.mergenature.model;

import br.ufjf.dcc.gmr.core.exception.NotGitRepositoryException;
import br.ufjf.dcc.gmr.core.exception.ShowException;
import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Class to record basic info about commits
 *
 * @author João Pedro Lima
 * @since 10-10-2020
 */
public class Commit {

    private int id;
    private String message;
    private String hash;
    private String author;
    private Date authorDate;
    private String committer;
    private Date committerDate;

    /**
     * Normal constructor
     *
     * @param id Id for databases
     * @param message The message that was written for commit description.
     * @param hash The unique code (hash) for commit.
     * @param author The person who originally wrote the code.
     * @param authorDate This date notes when this commit was originally made.
     * @param committer The person who committed the code on behalf of the
     * original author.
     * @param committerDate This date notes when this commit was commited.
     */
    public Commit(int id, String message, String hash, String author, Date authorDate, String committer, Date committerDate) {
        this.id = id;
        this.message = message;
        this.hash = hash;
        this.author = author;
        this.authorDate = authorDate;
        this.committer = committer;
        this.committerDate = committerDate;
    }

    /**
     * No id constructor
     *
     * @param message The message that was written for commit description.
     * @param hash The unique code (hash) for commit.
     * @param author The person who originally wrote the code.
     * @param authorDate This date notes when this commit was originally made.
     * @param committer The person who committed the code on behalf of the
     * original author.
     * @param committerDate This date notes when this commit was commited.
     */
    public Commit(String message, String hash, String author, Date authorDate, String committer, Date committerDate) {
        this.message = message;
        this.hash = hash;
        this.author = author;
        this.authorDate = authorDate;
        this.committer = committer;
        this.committerDate = committerDate;
    }

    /**
     *
     * @param hash The hash of the commit
     * @param repositoryPath The path of the Git repository where the commit is
     * @throws IOException If repositoryPath is not a path in system or the path
     * is not a Git repository
     */
    public Commit(String hash, String repositoryPath) throws IOException, NotGitRepositoryException, ShowException {
        List<String> info = Git.getBasicCommitInfo(hash, repositoryPath);
        this.message = info.get(5);
        this.hash = info.get(0);
        this.author = info.get(1);
        this.authorDate = new Date(Long.parseLong(info.get(2)) * 1000);
        this.committer = info.get(3);
        this.committerDate = new Date(Long.parseLong(info.get(4)) * 1000);
    }

    public Commit() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHash() {
        return hash;
    }

    public String getShortCommitHash() {
        return hash.substring(0, 7);
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getAuthorDate() {
        return authorDate;
    }

    public void setAuthorDate(Date authorDate) {
        this.authorDate = authorDate;
    }

    public String getCommitter() {
        return committer;
    }

    public void setCommitter(String committer) {
        this.committer = committer;
    }

    public Date getCommitterDate() {
        return committerDate;
    }

    public void setCommitterDate(Date committerDate) {
        this.committerDate = committerDate;
    }

    @Override
    public String toString() {
        return "Title: " + message + "\n"
                + "Hash: " + hash + "\n"
                + "Author: " + author + "\n"
                + "Author Date: " + authorDate + "\n"
                + "Committer: " + committer + "\n"
                + "Committer Date: " + committerDate;
    }
}