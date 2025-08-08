package Bai_2;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String HoTen;

    public QuanLy() {

    }

    public QuanLy(String MaQL, String HoTen) {
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String maQL) {
        MaQL = maQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void nhap(Scanner sc) {
        System.out.print("nhập mã quản lý: ");
        MaQL = sc.nextLine();
        System.out.print("nhập họ và tên: ");
        HoTen = sc.nextLine();
    }

    public void xuat() {
        System.out.println("mã quản lý: " + MaQL);
        System.out.println("họ và tên: " + HoTen);
    }
}
