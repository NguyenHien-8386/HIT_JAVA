package Bai_2;

import java.util.Scanner;

public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {
        x = new QuanLy();
    }

    public PhongMay(String MaPhong, String TenPhong, double DienTich, QuanLy x, May[] y, int n) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma phong: ");
        MaPhong = sc.nextLine();
        System.out.print("Nhap ten phong: ");
        TenPhong = sc.nextLine();
        System.out.print("Nhap dien tich: ");
        DienTich = Double.parseDouble(sc.nextLine());

        System.out.println("Nhap thong tin quan ly:");
        x.nhap(sc);

        System.out.print("Nhap so luong may: ");
        n = Integer.parseInt(sc.nextLine());
        y = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap may thu " + (i + 1) + ":");
            y[i] = new May();
            y[i].nhap(sc);
        }
    }

    public void xuat() {
        System.out.println("=== Thong tin phong may ===");
        System.out.println("Ma phong: " + MaPhong);
        System.out.println("Ten phong: " + TenPhong);
        System.out.println("Dien tich: " + DienTich);
        System.out.println("Thong tin quan ly:");
        x.xuat();
        System.out.println("Danh sach may:");
        for (int i = 0; i < n; i++) {
            System.out.println(" May thu " + (i + 1) + ":");
            y[i].xuat();
        }
    }

}
