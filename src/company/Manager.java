package company;

public class Manager extends Employee {

    private String password;

    public Manager(String document, String name, double salary, String password) {
        super(document, name, salary);
        this.password = password;
    }

    public boolean authentication(String password) {
        return this.password == password;
    }

    @Override
    public double getBonus() {
        return super.getSalary() + super.getSalary() * 0.05;
    }
}
