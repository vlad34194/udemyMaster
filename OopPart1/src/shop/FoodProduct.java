package shop;


import java.time.LocalDate;
import java.util.Date;

public class FoodProduct extends Product implements Expirable {
    public FoodProduct(String productName, double price, int quantity, String ageRestriction) {
        super(productName, price, quantity, ageRestriction);
    }


    @Override
    public LocalDate getExpirationDate() {
        return LocalDate.now();
    }

    @Override
    public double getPrice() {
        if(getExpirationDate().getDayOfMonth() <= getExpirationDate().getDayOfMonth()+15 ){
            return super.getPrice() * 0.7;
        }else{
            return super.getPrice();
        }
    }
}
