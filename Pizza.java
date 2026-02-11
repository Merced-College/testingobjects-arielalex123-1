//Ariel Penaloza
//02/04/2026
//Pizza Class for my Pizza objects

public class Pizza {

	// data variables
    private String type;        // Type of pizza
    private double price;      // Price
    private String size;      // Size
    
    // constructors
    public Pizza() {
        type = "Margarita";
        price = 8.99;
        size = "Small";
    }
    
    public Pizza(String type, double price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }
    
    // Getters y Setters 
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return "Pizza{type='" + type + "', price=" + price + ", size='" + size + "'}";
    }
}//end pizza class
