package Bai_1;
public class Student {
    private String Name;
    private String Class;
    private double Score;
    private Faculty y;

    public Student() {
        y = new Faculty();
    }

    public Student(String Name, String Class, double Score, Faculty y) {
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
        this.y = y;
    }

    public void input(java.util.Scanner sc) {
        System.out.print("Nhap ten sinh vien: ");
        Name = sc.nextLine();
        System.out.print("Nhap lop: ");
        String Class = sc.nextLine();
        System.out.print("Nhap diem: ");
        Score = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap thong tin khoa:");
        y.input(sc);
    }

    public void output() {
        System.out.println("=== Thong tin sinh vien ===");
        System.out.println("Ten: " + Name);
        System.out.println("Lop: " + Class);
        System.out.println("Diem: " + Score);
        System.out.println("Thong tin khoa:");
        y.output();
    }

    public String getName() { return Name; }
    public String getClassName() { return Class; }
    public double getScore() { return Score; }
    public Faculty getFaculty() { return y; }
    public void setName(String name) { this.Name = name; }
    public void setClassName(String className) { this.Class = Class; }
    public void setScore(double score) { this.Score = score; }
    public void setFaculty(Faculty y) { this.y = y; }
}
