
package br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example;

import java.util.Random;

public class Person {

    private String name;
    private String CPF;
    private int age;
    private Adress adress;
    Random rand;
    
    public Person(String name, String CPF, int Age) {
        this.name = name;
        this.CPF = CPF;
        this.age = Age;
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

    /**
     * @return the adress
     */
    public Adress getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
