package clases;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    protected void depositFunds(double increment){
        this.balance += increment;
        System.out.println("Deposit of " + increment + " made. New balance is " + this.balance);
    }
    protected void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Only " + this.balance + " available.");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
