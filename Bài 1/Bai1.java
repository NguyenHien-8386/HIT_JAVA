import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("xin chào " + name);
        System.out.print("nhập tuổi : ");
        int tuoi = sc.nextInt();
        System.out.println("tuổi: " + tuoi);
        System.out.print("nhập chiều cao: ");
        float chieuCao = sc.nextFloat();
        System.out.println("chiều cao: " + chieuCao + " m");
        sc.close();
    }
}
