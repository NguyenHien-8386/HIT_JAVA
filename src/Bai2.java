import java.util.Scanner;

public class Bai2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhập chuỗi: ");
        String chuoi = sc.nextLine();
        String a = chuoi.trim();
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (b.equalsIgnoreCase(a)) {
            String b1 = a.toUpperCase();
            System.out.println(b1 + " chuỗi này  đối xứng !");
        } else {
            String b2 = a.toLowerCase();
            System.out.println(b2 + " chuỗi này không đối xứng !");
        }
        sc.close();
    }
}
