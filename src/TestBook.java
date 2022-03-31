public class TestBook {

    public static void main(String[] args) {
        // Create a book object with specified attributes
        Book adventureBook = new Book("Adventure book", "Jan Nowak",
                1990, "ISDN-192", 20.0, 10);

        // View information about the book's author
        String author = adventureBook.getAuthor();
        System.out.println("Author of adventure book is: " + author);

        // Update the book price and display both prices before and after the change
        double oldPrice = adventureBook.getPrice();
        System.out.println("Price of adventure book before update: " + oldPrice);
        adventureBook.setPrice(50.0);
        double newPrice = adventureBook.getPrice();
        System.out.println("Price of adventure book after update: " + newPrice);

        // Purchase of 5 books and display of purchase price
        int buyQuantity = 5;
        adventureBook.buy(buyQuantity);
        double buyPrice = buyQuantity * adventureBook.getPrice();
        System.out.println("Purchase of " + buyQuantity + " books spent " + buyPrice);

    }
}