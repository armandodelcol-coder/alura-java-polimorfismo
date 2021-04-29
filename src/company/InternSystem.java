package company;

public class InternSystem {

    private String password = "1122";

    public void grantAccess(InternSystemAccess internSystemAccess) {
        if (internSystemAccess.authentication(password)) {
            System.out.println("Sistema interno diz: Acesso concedido!");
        } else {
            System.out.println("Sistema interno diz: Acesso negado!");
        }
    }

}
