package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author icout
 */
public class Version {
    String SHA, author, commiter, description;
    Date date;
    boolean merge;
    //conflict?
    List<File> file;
    List<String> parent;
    

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

    public Version(String SHA, String author, Date date, boolean merge, List<String> parent, String description) {
        this.SHA = SHA;
        this.author = author;
        this.date = date;
        this.merge = merge;
        this.description = description;
        this.parent = parent;
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

    public List<File> getFile() {
        return file;
    }

    public void setFile(List<File> file) {
        this.file = file;
    }
    
}
