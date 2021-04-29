package bytebank;

public abstract class Account {

    private static int total = 0;
    private double balance;
    private int agency;
    private int number;
    private Client titular;

    public Account(int agency, int number, Client titular) {
        Account.total++;
        this.agency = agency;
        this.number = number;
        this.titular = titular;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withDraw(double value) {
        if (value <= 0 || value > this.balance) return false;

        this.balance -= value;
        return true;
    }

    public boolean transfer(double value, Account toAccount) {
        if (withDraw(value)) {
            toAccount.deposit(value);
            return true;
        }

        return false;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotal() {
        return total;
    }

}
