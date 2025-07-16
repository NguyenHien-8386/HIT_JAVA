import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] name = new String[n];
        int[] age = new int[n];
        double[] gpa = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập thông tin sinh viên thứ " + (i + 1) + " ");
            System.out.print("tên: ");
            name[i] = sc.nextLine();
            System.out.print("tuổi: ");
            age[i] = sc.nextInt();
            System.out.print("GPA: ");
            gpa[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Danh sách sinh viên đã nhập !");
        for (int i = 0; i < n; i++) {
            System.out.printf("tên %s - tuổi %d - gpa %.2f\n", name[i], age[i], gpa[i]);
        }
        float tong = 0f;
        for (int i = 0; i < n; i++) {
            tong += gpa[i];
        }
        double dtb = tong / n;
        System.out.printf("điểm trung bình của cả lớp : %.2f", dtb);
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (gpa[max] < gpa[i]) {
                max = i;
            }
        }
        System.out.println("\nsinh viên có điểm cao nhất là: ");
        System.out.printf("tên: %s- tuổi: %d - gpa %.2f", name[max], age[max], gpa[max]);
        sc.close();
    }
}