
public class Bai5 {
    public static void main(String[] args) {
        System.out.println("bảng cửu trương của số 5 là: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        int ChanF = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                ChanF += i;
            }
        }
        System.out.println("tổng chẵn bằng vòng for: " + ChanF);
        int ChanW = 0;
        int j = 2;
        while (j <= 100) {
            ChanW += j;
            j += 2;
        }
        System.out.println("tổng chãn bằng vòng while: " + ChanW);
    }
}