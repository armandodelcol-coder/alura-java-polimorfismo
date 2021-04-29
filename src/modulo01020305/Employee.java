package modulo01020305;

public abstract class Employee {

    private String document;
    private String name;
    private double salary;

    public Employee(String document, String name, double salary) {
        this.document = document;
        this.name = name;
        this.salary = salary;
    }

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double getBonus();

}
