package shop;

import java.time.LocalDate;

public class MainShop {
    public static void main(String[] args) {
        Product cigars = new Product("Pall Mall negru click",6.90,1400,"Adult");
        Customer vlad = new Customer("Vlad",19,120);
        PurchaseManager.processPurchase(cigars,vlad);
        System.out.println("===========================");
        Customer andre = new Customer("Andreea", 17, 1.3);
        PurchaseManager.processPurchase(cigars,andre);
        System.out.println("===========================");
        Customer daniel = new Customer("Daniel", 14,645416.21);
        PurchaseManager.processPurchase(cigars,daniel);
        System.out.println("===========================");
        Computer computer = new Computer("Dell",542.43,100,"Teen");
        PurchaseManager.processPurchase(computer,daniel);

        System.out.println("..........................................");
        FoodProduct cirese = new FoodProduct("Cirese",23.2,3,"Teen");

    }
}
