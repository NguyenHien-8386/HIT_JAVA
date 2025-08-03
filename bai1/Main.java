package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ": ");
            System.out.print("Nhập họ và tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập năm sinh: ");
            int namSinh = sc.nextInt();
            sc.nextLine();
            System.out.print("nhập địa điểm: ");
            String diaDiem = sc.nextLine();
            System.out.print("nhập điểm tx1: ");
            double TX1 = sc.nextDouble();
            System.out.print("nhập điểm tx2: ");
            double TX2 = sc.nextDouble();
            System.out.print("nhập điểm kthp: ");
            double KTHP = sc.nextDouble();
            System.out.print("số tiết nghỉ: ");
            int soTietNghi = sc.nextInt();
            sc.nextLine();
            student[i] = new Student(name, namSinh, diaDiem, TX1, TX2, KTHP, soTietNghi);
        }
        System.out.printf("%-10s %-8s %-12s %-12s %-12s %-13s %-10s %-12s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");
        for (Student s : student) {

            System.out.printf("%-10s %-8d %-12s %-12.2f %-12.2f %-13.2f %-10.2f %-12d\n",
                    s.getName(), s.getAge(), s.getDiaDiem(), s.getTX1(), s.getTX2(), s.getKTHP(), s.getGPA(), s.getSoTietNghi());
        }
        sc.close();
    }
}