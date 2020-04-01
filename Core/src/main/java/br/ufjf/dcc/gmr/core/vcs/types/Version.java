package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author icout
 */
public class Version {

    /**
     * @return the status
     */
    public MergeStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(MergeStatus status) {
        this.status = status;
    }
    private String SHA;
    private String author;
    //conflict?
    private String commiter;
    private String description;
    private Date date;
    private boolean merge;
    private List<MyFile> file;
    private List<String> parent;
    private MergeStatus status;

    public Version() {
        SHA = new String();
        merge = false;
        author = new String();
        commiter = new String();
        date = new Date();
        file = new ArrayList<>();
        parent = new ArrayList<>();
        description = new String();
    }

    public Version(String SHA, String author, Date date, boolean merge,
            List<String> parent, String description, MergeStatus status) {
        this.SHA = SHA;
        this.author = author;
        this.date = date;
        this.merge = merge;
        this.description = description;
        this.parent = parent;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getParent() {
        return parent;
    }

    public void setParent(List<String> parent) {
        this.parent = parent;
    }
    
  


    public String getSHA() {
        return SHA;
    }

    public void setSHA(String SHA) {
        this.SHA = SHA;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCommiter() {
        return commiter;
    }

    public void setCommiter(String commiter) {
        this.commiter = commiter;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isMerge() {
        return merge;
    }

    public void setMerge(boolean merge) {
        this.merge = merge;
    }

    public List<MyFile> getFile() {
        return file;
    }

    public void setFile(List<MyFile> file) {
        this.file = file;
    }
    
}
