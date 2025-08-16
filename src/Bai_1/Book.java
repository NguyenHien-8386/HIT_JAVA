package Bai_1;

public class Book {
    private static int nextId = 1;
    private int bookId;
    public String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book() {

    }

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = nextId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, double price) {
        this.bookId = nextId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher("unknown", "unknown");
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void displayInfo() {
        System.out.print("BookId: " + bookId);
        System.out.print("Title: " + title);
        System.out.print("Author: " + author);
        System.out.print("Price: " + price);
    }

    public void displayInfo(boolean showPublisher) {
        displayInfo();
        if (showPublisher) {
            System.out.println("Publisher: " + publisher.getName() + " - " + publisher.getAddress());
        } else {
            System.out.println("Publisher: unknown");
        }
    }
}
