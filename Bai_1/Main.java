package Bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n== Nhap sinh vien thu " + (i + 1) + " ==");
            students[i] = new Student();
            students[i].input(sc);
        }

        System.out.println("\n=== Danh sach sinh vien ===");
        for (Student student : students) {
            student.output();
            System.out.println("---------------------------");
        }

        sc.close();
    }
}
