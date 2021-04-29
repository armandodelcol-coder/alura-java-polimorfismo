package modulo010203;

public class BonusControl {

    private double total;

    public double getTotal() {
        return total;
    }

    public void registerEmployee(Employee employee) {
        this.total += employee.getBonus();
    }

}
