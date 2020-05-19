package shop;

public class Appliance extends ElectronicProducts {
    public Appliance(String productName, double price, int quantity, String ageRestriction ) {
        super(productName, price, quantity, ageRestriction, 6);
    }

    @Override
    public double getPrice() {
        if(getQuantity() < 50){
            return super.getPrice()*0.5;
        }else{
            return super.getPrice();
        }
    }
}
