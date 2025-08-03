package bai2;

public class Student {
    private String name;
    private int birthYear;
    private String address;
    private double tx1;
    private double tx2;
    private double kthp;
    private int soTietNghi;

    public Student(String name, int birthYear, String address, double tx1, double tx2, double kthp, int soTietNghi) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.soTietNghi = soTietNghi;
    }

    public int getTuoi() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }

    public double getGPA() {
        return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTx1() {
        return tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public void display() {
        System.out.printf("%-15s%-8d%-15s%-12.2f%-12.2f%-14.2f%-10.2f%-12d\n",
                name, getTuoi(), address, tx1, tx2, kthp, getGPA(), soTietNghi);
    }
}

