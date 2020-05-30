/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.example;

/**
 *
 * @author ian
 */
public class JavaExample {
    private int age;
    public int one, two;

    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].toString();
    }

    /**
     * @return the age
     */
    public int getAge() {
        System.out.println(getMethodName());
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        System.out.println(getMethodName());
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println(getMethodName());
        int year;

        year = 2018;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("bla");
        }

        System.out.println("You were born in " + year);
        JavaExample je = new JavaExample();
        je.setAge(1999);
    }
}
