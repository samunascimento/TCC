package br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example;

public class Person {

    private String name;
    private String CPF;
    private String adress;
    private int age;

    public Person(String name, String CPF, String Adress, int Age) {
        this.name = name;
        this.CPF = CPF;
        this.adress = Adress;
        this.age = Age;
    }

    public void setInfo(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setInfo(int age, String name){
        this.age = age;
        this.name = name;
    }
    
    public Person() {
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param Adress the adress to set
     */
    public void setAdress(String Adress) {
        this.adress = Adress;
    }

    /**
     * @param Age the age to set
     */
    public void setAge(int Age) {
        this.age = Age;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @param name1 the name to set
     * @param name2
     */
    public void setName(String name1, String name2) {
        this.name = name1;
    }
}
