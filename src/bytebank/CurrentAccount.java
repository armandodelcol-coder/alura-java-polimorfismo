package bytebank;

public class CurrentAccount extends Account {

    public CurrentAccount(int agency, int number, Client titular) {
        super(agency, number, titular);
    }

    @Override
    public boolean withDraw(double value) {
        return super.withDraw(value + 0.20);
    }

}
