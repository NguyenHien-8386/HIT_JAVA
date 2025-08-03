package bai2;

import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Tên: ");
        String name = sc.nextLine();
        System.out.print("Năm sinh: ");
        int birthYear = Integer.parseInt(sc.nextLine());
        System.out.print("Địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Điểm TX1: ");
        double tx1 = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm TX2: ");
        double tx2 = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm KTHP: ");
        double kthp = Double.parseDouble(sc.nextLine());
        System.out.print("Số tiết nghỉ: ");
        int nghi = Integer.parseInt(sc.nextLine());

        students.add(new Student(name, birthYear, address, tx1, tx2, kthp, nghi));
        System.out.println("Đã thêm sinh viên thành công!\n");
    }

    public void editStudent(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("Nhập thông tin mới cho sinh viên " + name);
                System.out.print("Năm sinh: ");
                s.setBirthYear(Integer.parseInt(sc.nextLine()));
                System.out.print("Địa chỉ: ");
                s.setAddress(sc.nextLine());
                System.out.print("Điểm TX1: ");
                s.setTx1(Double.parseDouble(sc.nextLine()));
                System.out.print("Điểm TX2: ");
                s.setTx2(Double.parseDouble(sc.nextLine()));
                System.out.print("Điểm KTHP: ");
                s.setKthp(Double.parseDouble(sc.nextLine()));
                System.out.print("Số tiết nghỉ: ");
                s.setSoTietNghi(Integer.parseInt(sc.nextLine()));
                System.out.println("Đã cập nhật thông tin.\n");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có tên \"" + name + "\".\n");
    }

    public void deleteStudent(String name) {
        boolean removed = students.removeIf(s -> s.getName().equalsIgnoreCase(name));
        if (removed)
            System.out.println("Đã xóa sinh viên thành công.\n");
        else
            System.out.println("Không tìm thấy sinh viên.\n");
    }

    public void sortByAge() {
        students.sort(Comparator.comparingInt(Student::getTuoi));
        System.out.println("Đã sắp xếp theo tuổi tăng dần.\n");
    }

    public void sortByGPA() {
        students.sort((s1, s2) -> Double.compare(s2.getGPA(), s1.getGPA()));
        System.out.println("Đã sắp xếp theo GPA giảm dần.\n");
    }

    public void sortByAbsent() {
        students.sort(Comparator.comparingInt(Student::getSoTietNghi));
        System.out.println("Đã sắp xếp theo số tiết nghỉ tăng dần.\n");
    }

    public void showStudents() {
        System.out.printf("%-15s%-8s%-15s%-12s%-12s%-14s%-10s%-12s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");
        for (Student s : students) {
            s.display();
        }
        System.out.println();
    }
}
