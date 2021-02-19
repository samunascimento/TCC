package br.ufjf.dcc.gmr.core.jasome.model;

/**
 *
 * @author Beatr
 */
public class Login {
    private String user;
    private String pass;
    private String type;
    private int id;

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param password the password to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
}
