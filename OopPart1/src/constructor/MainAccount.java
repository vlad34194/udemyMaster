package constructor;

public class MainAccount {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getCustomerPhoneNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);

        Account timAccount = new Account("email@yahoo.com","07456465","Tim");
        System.out.println(timAccount.getCustomerAccount() + " name " + timAccount.getCustomerName());

        System.out.println("================================");
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob",2500.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Vlad",200.00,"vlad@gmail.com");
        System.out.println(person3.getName());
    }
}
