package Task3;

public class ChekingAccount extends Account{
    private int counter;
    private static final int FREE_TRANSACTIONS = 4;
    private static final double TRANSACTION_FEE = 0.02;

    public ChekingAccount(int accNumber) {
        super(accNumber);
        this.counter = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        counter++;
        deductFee();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        counter++;
        deductFee();
    }
    public void deductFee(){
        if (counter > FREE_TRANSACTIONS){
            withdraw(TRANSACTION_FEE);
        }
    }
    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", balance=" + getBalance() +
                ", transactionCount=" + counter +
                '}';
    }
}
