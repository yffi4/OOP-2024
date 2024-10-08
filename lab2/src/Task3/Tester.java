package Task3;

public class Tester {
    public static void main(String[] args) {
        Bank bank = new Bank();


        Account acc1 = new Account(12);
        SavingAccount sav1 = new SavingAccount(12, 3);
        ChekingAccount chk1 = new ChekingAccount(14);


        bank.openAccount(acc1);
        bank.openAccount(sav1);
        bank.openAccount(chk1);


        sav1.deposit(100);
        chk1.deposit(50);
        chk1.withdraw(20);
        chk1.withdraw(10);


        System.out.println("\nUpdating accounts...");
        bank.update();

        System.out.println("\nFinal account states:");
        bank.displayAccounts();

        bank.closeAccount(14);
    }
}

