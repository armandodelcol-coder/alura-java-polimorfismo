package company;

public class TrainingClasses {

    public static void main(String[] args) {
        Employee employee = new VideoEditor("0102030405-1", "Armando Tadeu", 2500.0, "Editor W");
        System.out.println("Funcionário: " + employee.getName());
        System.out.println("  Documento: " + employee.getDocument());
        System.out.println("  Salário: " + employee.getSalary());
        System.out.println("  Bonificação: " + employee.getBonus());

        System.out.println("-------------------------------");
        Manager manager = new Manager("01010405-22", "Luana Da Silva", 3800.0, "123456");
        System.out.println("Gerente: " + manager.getName());
        if (manager.authentication("123456")) {
            System.out.println("Gerente autenticada!");
            System.out.println("  Documento: " + manager.getDocument());
            System.out.println("  Salário: " + manager.getSalary());
            System.out.println("  Bonificação: " + manager.getBonus());
        }
    }

}
