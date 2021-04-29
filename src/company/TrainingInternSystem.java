package company;

public class TrainingInternSystem {

    public static void main(String[] args) {
        InternSystem internSystem = new InternSystem();

        Manager manager1 = new Manager("01020304-11", "Ana Claudia", 5700.0, "1122");
        Administrator adm1 = new Administrator("01548787-32", "Jonas Silva", 3200.0, "1122");
        Client client1 = new Client("Laura", "1145");

        internSystem.grantAccess(manager1);
        internSystem.grantAccess(adm1);
        internSystem.grantAccess(client1);
    }

}
