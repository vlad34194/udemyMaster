package constructor;

public class Account {
    private String customerEmailAddress;
    private String customerPhoneNumber;
    private String customerName;
    private String customerAccount;
    private double balance;

    public Account(){
        this("vlad.lirca@yahoo.com","0744225643","Lirca Vlad","464561616516",2.50);
        System.out.println("Empty constructor called");
    }

    public Account(String customerEmailAddress, String customerPhoneNumber, String customerName, String customerAccount, double balance) {
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerName = customerName;
        this.customerAccount = customerAccount;
        this.balance = balance;
    }

    public Account(String customerEmailAddress, String customerPhoneNumber, String customerName) {
        this(customerEmailAddress,customerPhoneNumber,customerName,"100.55",9999);

    }

    protected void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    protected void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Only " + this.balance + "available");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " processed. Remaining balance -> " + this.balance);
        }
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
