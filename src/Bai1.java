import java.util.Scanner;

public class Bai1 {
    public static final double PI = 3.141592654;
    public static final String Square = "Square";
    public static final String Triangle = "Triangle";
    public static final String Circle = "Circle";
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhập hình dạng: ");
        String hinhDang = sc.nextLine();
        System.out.println("hình dạng bạn vừa nhập là: " + hinhDang);
        double dienTich = 0;
        switch (hinhDang) {
            case Square:
                System.out.print("nhập cạnh hình vuông: ");
                double canh = sc.nextDouble();
                dienTich = canh * canh;
                System.out.printf("diện tích hình vuông là: %.2f", dienTich);
                break;
            case Triangle:
                System.out.println("nhập cạnh đáy: ");
                double canhDay = sc.nextDouble();
                System.out.println("nhập chiều cao: ");
                double chieuCao = sc.nextDouble();
                System.out.println("cạnh đáy hình tam giác là: " + canhDay);
                System.out.println("chiều cao tam giác là: " + chieuCao);
                dienTich = 0.5 * canhDay * chieuCao;
                System.out.printf("diện tích hình tam giác là: %.2f", dienTich);
                break;
            case Circle:
                System.out.println("nhập bán kính hình tròn: ");
                double banKinh = sc.nextDouble();
                System.out.println("bán kính vừa nhập là: "+banKinh);
                dienTich = PI * banKinh * banKinh;
                System.out.printf("diện tích hình tròn là: %.2f", dienTich);
                break;
            default:
                System.out.println("hình dạng không hợp lệ !");
        }
        sc.close();
    }
}
