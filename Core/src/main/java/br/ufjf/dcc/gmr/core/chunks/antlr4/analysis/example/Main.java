package br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private String name;
    private int age;
    private String office;

    public Main(String name, String office, int age) {
        this.age = age;
        this.office = office;
        this.name = name;
    }
    public Main(){
        
    }

    public static void main(String[] args) {

        Main main = new Main("Office", "Felippe", 23);
        Person person = new Person();
        person.setName("name of a person");
        EmployeeExtends employeeExtends = new EmployeeExtends("Ofice", "1524-abc", 0, true, "Felippe", "132.259.762.58", 23);
        employeeExtends.setName("name of a employeeExtends");
        Employee employee = new Employee();
        employee.setName("name of a employee");
        System.out.println(main.name + " " + main.office + " " + main.age);
        float teste = 3;
        List<String> aux = new ArrayList<>();
        aux.add("0");

        for (int i = 0; i < 10; i++) {
            float j = 3;
            j += i;
        }

        if (employee != null) {
            if (employee.getName().equals("name of a employee")) {
                Person person1 = person;
            } else if (person.getAge() == 23) {
                EmployeeExtends employeeExtends1 = employeeExtends;
            } else if (employeeExtends.getSalary() == 300) {//
                Employee employee1 = employee;
            }
        }

        employeeExtends.increaseSalary(50);//
        employeeExtends.setActive(false);//
        int x = 4;
        float w = 50;
        String y = "kkk";
        person.getName();
        main.getName();
        employee.setInfo(y, x);
        person.setInfo(y, x);
        person.setInfo(x, y);

        employee.getAdress().getCity();

        System.out.println(employeeExtends.getAdress().getCity());
    }

    public Person person(Person person) {
        return person;
    }

    public void teste() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
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

        String falatu;
        this.name = name;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }
}
