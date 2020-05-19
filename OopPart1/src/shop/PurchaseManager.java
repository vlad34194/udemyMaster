package shop;

public class PurchaseManager {
    private Customer customer;
    private Product product;

    public PurchaseManager(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }
    public static void processPurchase(Product product, Customer customer){
        if(product.getQuantity() < 1){
            System.out.println("We don't have anymore this product ");
        }else{
            if(customer.getBalance() - product.getPrice() < 0){
                System.out.println("You don't have enough money");
            }else{
                customer.setBalance(customer.getBalance() - product.getPrice());
                product.setQuantity(product.getQuantity() - 1);
            }
        }
        if(customer.getAge() < 18 && (product.getAgeRestriction() == "Teen" || product.getAgeRestriction() == "None")){
            System.out.println("This is product for teenagers.");
        }else if(customer.getAge() < 18 && product.getAgeRestriction() == "Adult"){
            System.out.println("You are too young to buy this product");
        } else{
            System.out.println(product.getProductName() + " take your product");
        }

    }
}
