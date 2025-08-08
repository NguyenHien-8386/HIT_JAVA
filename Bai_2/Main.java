package Bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhongMay pm = new PhongMay();
        pm.nhap(sc);
        System.out.println();
        pm.xuat();
        sc.close();
    }
}

