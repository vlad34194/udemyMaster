package shop;

public class Computer extends ElectronicProducts implements Buyable {
    public Computer(String productName, double price, int quantity, String ageRestriction) {
        super(productName, price, quantity, ageRestriction, 24);
    }

    @Override
    public double getPrice() {
        if(getQuantity() > 1000){
            return super.getPrice() * 0.95;
        }else{
            return super.getPrice();
        }
    }
}
