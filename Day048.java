
package pkg100dayscoding;

import java.util.Scanner;

public class Day048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih operasi: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + (a + b));
                break;
            case 2:
                System.out.println("Hasil: " + (a - b));
                break;
            case 3:
                System.out.println("Hasil: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Hasil: " + ((double) a / b));
                } else {
                    System.out.println("Tidak bisa dibagi nol");
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}
