package company;

public class Manager extends Employee implements InternSystemAccess {

    private String password;

    public Manager(String document, String name, double salary, String password) {
        super(document, name, salary);
        this.password = password;
    }

    @Override
    public double getBonus() {
        return super.getSalary() + super.getSalary() * 0.05;
    }

    @Override
    public boolean authentication(String password) {
        System.out.println("Gerente: " + super.getName() + " - Autenticando...");
        return this.password == password;
    }

}
