package pkg100dayscoding;

import java.util.Scanner;

public class Day028 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        System.out.println("Apakah angka " + a + " sama dengan angka " + b + " hasilnya : " + (a == b));
        System.out.println("Apakah angka " + a + " tidak sama dengan angka " + b + " hasilnya : " + (a != b));
    }
}
