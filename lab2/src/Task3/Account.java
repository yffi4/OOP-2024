package Task3;

public class Account {
    private double balance;
    private int accNumber;
    public Account(int accNumber){
        this.balance = 0.0;
        this.accNumber = accNumber;
    }
    public void deposit(double sum){
        balance += sum;
    }
    public void withdraw(double sum){
        if (balance >= sum) {
            balance -= sum;
        }else{
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }
    public void transfer(double amount, Account other){
        if (balance >= amount){
            this.withdraw(amount);
            other.deposit(amount);
            System.out.println("Transfer of $" + amount + " to account completed.");
        }else{
            System.out.println("Insufficient funds");

        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accNumber=" + accNumber +
                '}';
    }
    public final void print(){
        System.out.println(toString());
    }
}
