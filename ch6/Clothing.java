package ntou.cs.java2025;

public class Clothing extends Product {
    private final String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public double calculateProductItemPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public String toString() {
        return getName() + " | Price: $" + String.format("%.2f", getPrice())
               + " | Quantity: " + getQuantity()
               + " | Size: " + size;
    }
}