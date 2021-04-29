package company;

public class Manager extends Employee implements InternSystemAccess {

    private Authenticator authenticator = new Authenticator();

    public Manager(String document, String name, double salary, String password) {
        super(document, name, salary);
        authenticator.setPassword(password);
    }

    @Override
    public double getBonus() {
        return super.getSalary() + super.getSalary() * 0.05;
    }

    @Override
    public boolean authentication(String password) {
        System.out.println("Gerente: " + super.getName() + " - Autenticando...");
        return this.authenticator.authentication(password);
    }

}
