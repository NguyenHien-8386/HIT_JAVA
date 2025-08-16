package Bai_1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks(boolean showPublisher) {
        if (books.isEmpty()) {
            System.out.println("thư viện chưa có danh sách nào !");
            return;
        }
        for (Book book : books) {
            book.displayInfo(showPublisher);
            System.out.println("------");
        }
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                book.displayInfo(true); // in cả publisher
                System.out.println("-----------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("không tìm thấy sách của tác giả chứa từ khóa: " + author);
        }
    }

    public void removeBookById(int bookId) {
        Book bookToRemove = null;

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Đã xóa sách có ID = " + bookId);
        } else {
            System.out.println("Không tìm thấy sách có ID = " + bookId);
        }
    }
}