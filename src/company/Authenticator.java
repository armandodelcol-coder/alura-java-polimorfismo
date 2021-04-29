package company;

public class Authenticator {

    private String password;

    public boolean authentication(String password) {
        return this.password == password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
