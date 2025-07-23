import java.util.Scanner;

public class Bai3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double a = (Math.random() * 100) + 1;
        double b = (Math.random() * 100) + 1;
        double c = (Math.random() * 200) + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("phép toán: " + a + " + " + b + " = " + c);
        System.out.print("nhập câu trả lời của bạn ( Correct / Incorrect): ");
        String dapAn = sc.nextLine();
        boolean kiemTra = (a + b == c);
        if ((kiemTra && dapAn.equalsIgnoreCase("Correct")) || (!kiemTra && dapAn.equalsIgnoreCase("Method…"))) {
            System.out.println("bạn đã trả lời đúng !");
        } else {
            System.out.println("bạn đã trả lời sai !");
        }
    }
}
