/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example;

/**
 *
 * @author icout
 */
public class Employee {

    private String office;
    private String registration;
    private String name;
    private String CPF;
    private float salary;
    private boolean active;
    private int age;
    private Adress adress;

    public Employee(String office, String registration, String name, String CPF, float salary, boolean active, int age, Adress adress) {
        this.office = office;
        this.registration = registration;
        this.name = name;
        this.CPF = CPF;
        this.salary = salary;
        this.active = active;
        this.age = age;
        this.adress = adress;
    }

    public Employee() {
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void increaseSalary(float increase) {
        this.salary += increase;
    }

    public void dismiss() {
        this.active = false;
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(int age, String name) {
        this.age = age;
        this.name = name;
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
