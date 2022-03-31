public class Book {
    String title;
    String author;
    int publicationYear;
    String id;
    double price;
    int quantity;

    public Book(String title, String author, int publicationYear,
                String id, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public void buy(int quantity) {
        this.quantity += quantity;
    }

    public void sell(int quantity) {
        this.quantity -= quantity;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}