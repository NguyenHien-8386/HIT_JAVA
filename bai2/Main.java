package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên khỏi danh sách");
            System.out.println("4. Sắp xếp theo tuổi");
            System.out.println("5. Sắp xếp theo GPA");
            System.out.println("6. Sắp xếp theo số tiết nghỉ");
            System.out.println("7. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> manager.addStudent();
                case 2 -> {
                    System.out.print("Nhập tên sinh viên cần sửa: ");
                    manager.editStudent(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Nhập tên sinh viên cần xóa: ");
                    manager.deleteStudent(sc.nextLine());
                }
                case 4 -> manager.sortByAge();
                case 5 -> manager.sortByGPA();
                case 6 -> manager.sortByAbsent();
                case 7 -> manager.showStudents();
                case 0 -> System.out.println("Đã thoát.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}
