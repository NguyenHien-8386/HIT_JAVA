package bai1;

import java.time.LocalDate;
//import java.util.Locale;

public class Student {
    public String name;
    public int namSinh;
    public String diaDiem;
    public double TX1;
    public double TX2;
    public double KTHP;
    public int soTietNghi;

    public Student(String name, int namSinh, String diaDiem, double TX1, double TX2, double KTHP, int soTietNghi) {
        this.name = name;
        this.namSinh = namSinh;
        this.diaDiem = diaDiem;
        this.TX1 = TX1;
        this.TX2 = TX2;
        this.KTHP = KTHP;
        this.soTietNghi = soTietNghi;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - namSinh;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public double getTX2() {
        return TX2;
    }

    public double getTX1() {
        return TX1;
    }

    public double getKTHP() {
        return KTHP;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public double getGPA() {
        return TX1 * 0.2 + TX2 * 0.3 + KTHP * 0.5;
    }
}
