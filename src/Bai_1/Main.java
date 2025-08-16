package Bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ THƯ VIỆN =====");
            System.out.println("1. Thêm sách vào thư viện");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách theo tác giả");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số từ 1 đến 5.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhập tiêu đề: ");
                    String title = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = Double.parseDouble(sc.nextLine());

                    System.out.print("Bạn có muốn nhập nhà xuất bản không? (y/n): ");
                    String opt = sc.nextLine();

                    if (opt.equalsIgnoreCase("y")) {
                        System.out.print("Tên nhà xuất bản: ");
                        String pubName = sc.nextLine();
                        System.out.print("Địa chỉ nhà xuất bản: ");
                        String pubAddress = sc.nextLine();
                        Publisher publisher = new Publisher(pubName, pubAddress);
                        Book book = new Book(title, author, price, publisher);
                        library.addBook(book);
                    } else {
                        Book book = new Book(title, author, price);
                        library.addBook(book);
                    }
                    System.out.println("Đã thêm sách thành công!");
                    break;

                case 2:
                    System.out.print("Bạn có muốn hiển thị nhà xuất bản không? (y/n): ");
                    String show = sc.nextLine();
                    boolean showPublisher = show.equalsIgnoreCase("y");
                    library.displayAllBooks(showPublisher);
                    break;

                case 3:
                    System.out.print("Nhập tên tác giả cần tìm: ");
                    String keyword = sc.nextLine();
                    library.searchByAuthor(keyword);
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    library.removeBookById(id);
                    break;

                case 5:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập từ 1-5.");
            }
        }
>>>>>>> 32f7046 (nộp bài tập tuần 6)
>>>>>>> d835135 (nộp bài tuần 6)
    }
}
