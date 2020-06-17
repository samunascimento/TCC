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
public class Main {

    private String name;
    private String office;
    private int age;

    public Main(String name, String office, int age) {
        this.name = name;
        this.age = age;
        this.office = office;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Felippe");
        Employee employee = new Employee("Ofice", "1524-abc", 0, true, "Felippe", "132.259.762.58", "", 23);
        Main main = new Main("Office", "Felippe", 23);
        System.out.println(main.name + " " + main.office + " " + main.age);
        if(true){
            int a = 0;
        }else{
            float b = 2;
        }
        employee.increaseSalary(50);
        employee.setAdress("Rua ABC, Bairro, DEF");
        employee.setActive(false);
        int x =4;
        String y = "kkk";
        employee.getName();
        person.getName();
        main.getName();
        
        person.setInfo(y, x);
        person.setInfo(x, y);
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the office
     */
    public String getOffice() {
        return office;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }
}
