package company;

public class Client implements InternSystemAccess {

    private String name;
    private String password;

    public Client(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean authentication(String password) {
        System.out.println("Cliente: " + this.name + " - Autenticando...");
        return this.password == password;
    }

}
