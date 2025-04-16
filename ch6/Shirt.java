package ntou.cs.java2025;

public class Shirt extends Clothing {
    private final String material;

    public Shirt(String name, double price, String size, String material) {
        super(name, price, size);
        this.material = material;
    }

    @Override
    public String toString() {
        return getName() + " | Price: $" + String.format("%.2f", getPrice())
               + " | Quantity: " + getQuantity()
               + " | Size: " + getSize()
               + " | Material: " + material;
    }
}