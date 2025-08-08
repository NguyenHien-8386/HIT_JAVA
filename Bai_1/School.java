package Bai_1;

public class School {
    private String Name;
    private String Date;

    public School() {
    }

    public School(String Name, String Date) {
        this.Name = Name;
        this.Date = Date;
    }

    public void input(java.util.Scanner sc) {
        System.out.print("  Nhap ten truong: ");
        Name = sc.nextLine();
        System.out.print("  Nhap ngay vao truong: ");
        Date = sc.nextLine();
    }

    public void output() {
        System.out.println("  Ten truong: " + Name);
        System.out.println("  Ngay vao truong: " + Date);
    }

    public String getName() {
        return Name;
    }

    public String getDate() {
        return Date;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
}

