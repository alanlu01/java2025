package ntou.cs.java2025;

public class Novel extends Book {
    private final String genre;

    public Novel(String name, double price, String author, String genre) {
        super(name, price, author);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return getName() + " | Price: $" + String.format("%.2f", getPrice())
               + " | Quantity: " + getQuantity()
               + " | Author: " + getAuthor()
               + " | Genre: " + genre;
    }
}