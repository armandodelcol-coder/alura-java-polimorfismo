package company;

public class Client implements InternSystemAccess {

    private String name;
    private Authenticator authenticator = new Authenticator();

    public Client(String name, String password) {
        this.name = name;
        authenticator.setPassword(password);
    }

    @Override
    public boolean authentication(String password) {
        System.out.println("Cliente: " + this.name + " - Autenticando...");
        return this.authenticator.authentication(password);
    }

}
