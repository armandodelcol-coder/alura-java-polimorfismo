package bytebank;

public class CurrentAccount extends Account implements Taxable {

    public CurrentAccount(int agency, int number, Client titular) {
        super(agency, number, titular);
    }

    @Override
    public boolean withDraw(double value) {
        return super.withDraw(value + 0.20);
    }

    @Override
    public double getTaxValue() {
        return super.getBalance() * 0.22;
    }

}
