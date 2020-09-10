package br.ufjf.dcc.gmr.core.conflictanalysis.model;

import br.ufjf.dcc.gmr.core.vcs.Git;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author joao
 */
public class CommitData {

    public CommitData(String hash, String repositoryPath) throws IOException {
        List<String> info = Git.getBaseCommitInfo(hash, repositoryPath);
        this.commitHash = info.get(0);
        this.author = info.get(1);
        this.authorDate = new Date(Long.parseLong(info.get(2)) * 1000);
        this.committer = info.get(3);
        this.committerDate = new Date(Long.parseLong(info.get(4)) * 1000);
        this.title = info.get(5);
    }

    public CommitData() {
    }

    public String getCommitHash() {
        return commitHash;
    }

    public String getAuthor() {
        return author;
    }

    public Date getAuthorDate() {
        return authorDate;
    }

    public String getCommitter() {
        return committer;
    }

    public Date getCommitterDate() {
        return committerDate;
    }

    public String getTitle() {
        return title;
    }

    private String commitHash;
    private String author;
    private Date authorDate;
    private String committer;
    private Date committerDate;
    private String title;
    private int id;

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAuthorDate(Date authorDate) {
        this.authorDate = authorDate;
    }

    public void setCommitter(String committer) {
        this.committer = committer;
    }

    public void setCommitterDate(Date committerDate) {
        this.committerDate = committerDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CommitData{" + "commitHash=" + commitHash + ", author=" + author + ", authorDate=" + authorDate + ", committer=" + committer + ", committerDate=" + committerDate + ", title=" + title + ", id=" + id + '}';
    }

}
