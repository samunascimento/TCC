package br.ufjf.dcc.gmr.core.chunks.antlr4.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.function.Function;

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

    public int sum(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
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

    @RectangleElement(isRun = true, array = {1, 5, 3})
    public static void main(String[] args) {
        
        //lambda expression
        Function<Integer, Integer> function = (x) -> x * 3 + 2;
        Integer resultado = function.apply(2);
        System.out.println(resultado);

        try (BufferedReader br = new BufferedReader(new FileReader("d:\\myfile.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException ie) {
            System.out.println("exception");
        }

        System.out.println(getMethodName());
        int year;

        year = 2018;

        for (int i = 0; i < 10; i++) {
            System.out.println("bla");
        }

        System.out.println("You were born in " + year);
        JavaExample je = new JavaExample();
        je.setAge(1999);
        System.out.println(je.sum(1, 2, 3, 4, 5, 6));
    }
}
