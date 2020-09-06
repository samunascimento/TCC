package br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example;

import br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example2.Person2;

public class Person extends Person2{

    private String name;
    private String CPF;
    private int age;
    private Adress adress;

    public Person(String name, String CPF, int Age) {
        this.name = name;
        this.CPF = CPF;
        this.age = Age;
    }

    @Override
    public String toString() {
        String aux = "name: ".concat(name).concat("\n");
        aux = aux.concat("CPF: " + CPF);
        return aux;
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

}
