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
                System.out.println("Chọn cách nhập:");
                System.out.println("1. Nhập cạnh đáy và chiều cao");
                System.out.println("2. Nhập 3 cạnh");
                System.out.print("Lựa chọn (1 hoặc 2): ");
                int truongHop = sc.nextInt();
                if (truongHop == 1) {
                    System.out.print("Nhập cạnh đáy: ");
                    double canhDay = sc.nextDouble();
                    System.out.print("Nhập chiều cao: ");
                    double chieuCao = sc.nextDouble();
                    dienTich = 0.5 * canhDay * chieuCao;
                    System.out.printf("Diện tích tam giác là: %.2f", dienTich);
                } else if (truongHop == 2) {
                    System.out.print("Nhập cạnh a: ");
                    double a = sc.nextDouble();
                    System.out.print("Nhập cạnh b: ");
                    double b = sc.nextDouble();
                    System.out.print("Nhập cạnh c: ");
                    double c = sc.nextDouble();
                    if (a + b > c && b + c > a && c + a > b) {
                        double s = (a + b + c) / 2;
                        dienTich = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        System.out.printf("Diện tích tam giác là: %.2f", dienTich);
                    } else {
                        System.out.println("Ba cạnh không tạo thành một tam giác hợp lệ!");
                    }
                } else {
                    System.out.println("Lựa chọn không hợp lệ.");
                }
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
