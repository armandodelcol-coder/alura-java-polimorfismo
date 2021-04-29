package company;

public class Administrator extends Employee implements InternSystemAccess {

    private Authenticator authenticator = new Authenticator();

    public Administrator(String document, String name, double salary, String password) {
        super(document, name, salary);
        authenticator.setPassword(password);
    }

    @Override
    public double getBonus() {
        return 800;
    }

    @Override
    public boolean authentication(String password) {
        System.out.println("Administrador: " + super.getName() + " - Autenticando...");
        return this.authenticator.authentication(password);
    }

}
