package company;

public class Administrator extends Employee implements InternSystemAccess {

    private String password;

    public Administrator(String document, String name, double salary, String password) {
        super(document, name, salary);
        this.password = password;
    }

    @Override
    public double getBonus() {
        return 800;
    }

    @Override
    public boolean authentication(String password) {
        System.out.println("Administrador: " + super.getName() + " - Autenticando...");
        return this.password == password;
    }

}
