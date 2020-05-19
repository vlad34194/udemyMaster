package shop;

public class ElectronicProducts extends Product {
    private int guaranteePeriod;

    public ElectronicProducts(String productName, double price, int quantity, String ageRestriction, int guaranteePeriod) {
        super(productName, price, quantity, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
