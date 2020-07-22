package br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;

public class Main {

    private String name;
    private String office;
    private int age;
    
    
    public Main(String name, String office, int age) {
        this.name = name;
        this.age = age;
        this.office = office;
    }
    
    private static List<String> javaFiles(String dir){
        List<String> javaFiles = new ArrayList<>();
        File file = new File(dir);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile() && file1.getAbsolutePath().endsWith(".java")){
                javaFiles.add(file1.getAbsolutePath());
            }else if(file1.isDirectory()){
                javaFiles.addAll(javaFiles(file1.getAbsolutePath()));
            }
        }
        return javaFiles;
    }

    public static void main(String[] args) {
        List<String> javaFiles = javaFiles("C:\\Users\\icout\\OneDrive\\Documentos\\NetBeansProjects\\UFJF");
        for (String javaFile : javaFiles) {
            System.out.println(javaFile);
        }
        /*Main main = new Main("Office", "Felippe", 23);
        Person person = new Person();
        person.setName("name of a person");
        EmployeeExtends employeeExtends = new EmployeeExtends("Ofice", "1524-abc", 0, true, "Felippe", "132.259.762.58", 23);
        employeeExtends.setName("name of a employeeExtends");//
        Employee employee = new Employee();
        employee.setName("name of a employee");
        System.out.println(main.name + " " + main.office + " " + main.age);
        
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
        int x =4;
        float w = 50;
        String y = "kkk";
        person.getName();
        main.getName();
        employee.setInfo(y, x);
        person.setInfo(y, x);
        person.setInfo(x, y);

        person.getAdress().getCity();
        employee.getAdress().getCity();

        System.out.println(employeeExtends.getAdress().getCity());//*/
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
