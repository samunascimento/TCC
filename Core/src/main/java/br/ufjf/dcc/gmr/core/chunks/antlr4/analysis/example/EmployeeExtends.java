package br.ufjf.dcc.gmr.core.chunks.antlr4.analysis.example;

public class EmployeeExtends extends Person {

    private String office;
    private String registration;
    private float salary;
    private boolean active;

    public EmployeeExtends(String office, String registration, float salary, boolean active, String name, String cpf, int age) {
        super(name, cpf, age);
        this.office = office;
        this.registration = registration;
        this.salary = salary;
        this.active = active;
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
}
