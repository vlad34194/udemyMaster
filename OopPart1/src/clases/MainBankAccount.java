package clases;


public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount vladAccount = new BankAccount();
        vladAccount.withdraw(100.0);

        vladAccount.depositFunds(50.0);
        vladAccount.withdraw(100.0);

        vladAccount.depositFunds(51.0);
        vladAccount.withdraw(100.0);
    }
}
