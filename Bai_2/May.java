package Bai_2;


import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public May() {
    }

    public May(String MaMay, String TenMay, String TinhTrang) {
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }

    public void nhap(Scanner sc) {
        System.out.print("  Nhap ma may: ");
        MaMay = sc.nextLine();
        System.out.print("  Nhap ten may: ");
        TenMay = sc.nextLine();
        System.out.print("  Nhap tinh trang may: ");
        TinhTrang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("  Ma may: " + MaMay);
        System.out.println("  Ten may: " + TenMay);
        System.out.println("  Tinh trang: " + TinhTrang);
    }

    public String getMaMay() {
        return MaMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setMaMay(String maMay) {
        this.MaMay = MaMay;
    }

    public void setTenMay(String TenMay) {
        this.TenMay = TenMay;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
}

