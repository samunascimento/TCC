package br.ufjf.dcc.gmr.core.chunks.antlr4.example;

import java.io.Serializable;

public class JavaExample {
    
    @RectangleElement()
    private int age;
    public int one, two;
    public String str;

    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].toString();
    }

    public <E extends Serializable> JavaExample(E element) {
        int aux = 0;
        this.str = element.toString();
    }
    
    /**
     * constructor
     */
    public JavaExample() {
        this.age = 0;
        this.one = 1;
        this.two = 2;
        this.str = null;
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
