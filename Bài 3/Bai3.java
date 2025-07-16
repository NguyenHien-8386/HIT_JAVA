import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số a: ");
        int a = sc.nextInt();
        System.out.print("nhập số thực b: ");
        float b = sc.nextFloat();
        System.out.println("hai số vừa nhập là: " + a + " ; " + b);
        System.out.print("tổng 2 số = " + (a + b) + "\n");
        System.out.print("hiệu 2 số = " + (a - b) + "\n");
        System.out.print("tích 2 số = " + (a * b) + "\n");
        System.out.print("thương 2 số = " + (double) a / b + "\n");
        System.out.print("chia có dư = " + (a % b) + "\n");
        sc.close();
    }
}
