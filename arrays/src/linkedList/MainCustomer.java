package linkedList;

import java.util.ArrayList;

public class MainCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> inList = new ArrayList<>();
        inList.add(1);
        inList.add(2);
        inList.add(3);
        inList.add(4);
        for (int i = 0; i < inList.size(); i++) {
            System.out.println(i + ": " + inList.get(i));
        }
        inList.add(1,2);
        System.out.println("====================");
        for (int i = 0; i < inList.size(); i++) {
            System.out.println(i + ": " + inList.get(i));
        }

    }
}
