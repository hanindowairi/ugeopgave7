public class Drinks {
    private double price;

    public void setPrice(double price){
        if (price < 0){
            throw new IllegalArgumentException("Price can not be negative");
        }
        this.price = price;
        
    } 
}
