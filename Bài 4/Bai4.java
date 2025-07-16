import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số lượng phần tử: ");
        int n = sc.nextInt();
        System.out.println(" số lượng phần tử đã nhập là: " + n);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhập a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.print("các phần tử trong mảng là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
            sum += a[i];
        }
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("tổng các phần tử trong mảng: " + sum);
        System.out.println("giá trị lớn nhất của mảng: " + max);
        sc.close();
    }
}