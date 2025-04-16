package ntou.cs.java2025;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Requirement 4：addItem
    public void addItem(Product product, int quantity) {
        product.setQuantity(quantity);        // 設定購買數量
        items.add(product);                   // 加入購物車

        double subtotal = product.calculateProductItemPrice();
        System.out.printf("Add Product: %s | Subtotal: %.3f%n",
                          product, subtotal);
    }

    // Requirement 4：calculateTotalPrice
    public double calculateTotalPrice() {
        double total = 0;
        for (Product p : items) {
            total += p.calculateProductItemPrice();
        }
        return total;
    }

    // Requirement 4：applyDiscount
    public double applyDiscount(double discountPercentage) {
        double total = calculateTotalPrice();
        return total * (1 - discountPercentage / 100.0);
    }
}