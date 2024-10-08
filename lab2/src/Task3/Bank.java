package Task3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;
    public Bank(){
        accounts = new Vector<>();
    }
    public void openAccount(Account account){
        accounts.add(account);
        System.out.println("Account opened: " + account);
    }
//    public void closeAccount(int accountNumber){
//        for (int i = 0; i < accounts.size(); i++){
//            if (accounts.get(i).getAccountNumber() == accountNumber){
//                System.out.println("Closing account: " + accountNumber);
//                accounts.remove(i);
//                return;
//            }
//        }
//        System.out.println("Account not found");
//    }
    public void closeAccount(int accountNumber){
        accounts.remove(new Account(accountNumber));
    }
    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingAccount) {
                ((SavingAccount) account).addInterest();
            } else if (account instanceof ChekingAccount) {
                ((ChekingAccount) account).deductFee();
            }
        }
    }
    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
