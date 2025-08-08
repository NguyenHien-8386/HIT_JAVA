package Bai_1;

public class Faculty {
    private String Name;
    private String Date;
    private School x;

    public Faculty() {
        x = new School();
    }

    public Faculty(String Name, String Date, School x) {
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }

    public void input(java.util.Scanner sc) {
        System.out.print(" Nhap ten khoa: ");
        Name = sc.nextLine();
        System.out.print(" Nhap ngay vao khoa: ");
        Date = sc.nextLine();
        System.out.println(" Nhap thong tin truong:");
        x.input(sc);
    }

    public void output() {
        System.out.println(" Ten khoa: " + Name);
        System.out.println(" Ngay vao khoa: " + Date);
        System.out.println(" Thong tin truong:");
        x.output();
    }

    public String getName() {
        return Name;
    }

    public String getDate() {
        return Date;
    }

    public School getSchool() {
        return x;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setSchool(School x) {
        this.x = x;
    }
}
