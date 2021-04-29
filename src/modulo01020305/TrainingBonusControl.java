package modulo01020305;

public class TrainingBonusControl {

    public static void main(String[] args) {
        Employee employee1 = new Manager("0102030405-10", "Armando Tadeu", 2500.0, "123");
        Employee employee2 = new VideoEditor("0202030405-11", "Ana Claudia", 3100.0, "Editor Y");

        Manager manager1 = new Manager("02030506-11", "Roberta Lima", 4200.0, "123");

        VideoEditor videoEditor1 = new VideoEditor("01040508-23", "Luciana Rodrigues", 2600.0, "Editor X");

        BonusControl bonusControl = new BonusControl();
        bonusControl.registerEmployee(employee1);
        bonusControl.registerEmployee(employee2);
        bonusControl.registerEmployee(manager1);
        bonusControl.registerEmployee(videoEditor1);

        System.out.println("Total de bonificação é: " + bonusControl.getTotal());
    }

}
