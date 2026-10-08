package pkg100dayscoding;

import java.util.Scanner;

public class Day037 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("bilangan positif");
        } else if (a < 0) {
            System.out.println("bilangan negatif");
        } else {
            System.out.println("bilangan 0");
        }
    }
}
