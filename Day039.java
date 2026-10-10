package pkg100dayscoding;

import java.util.Scanner;

public class Day039 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int a = sc.nextInt();

        System.out.println("1. penjumlahan (+)");
        System.out.println("2. pengurangan (-)");
        System.out.println("3. perkalian (*)");
        System.out.println("4. pembagian (/)");
        System.out.println("5. modulus (%)");
        System.out.print("Pilih operator 1-5 : ");
        int pilihan = sc.nextInt();

        System.out.print("Masukkan angka kedua : ");
        int b = sc.nextInt();

        if (pilihan == 1) {
            int hasil = a + b;
            System.out.println("Hasil Penjumlahan : " + hasil);

        } else if (pilihan == 2) {
            int hasil = a - b;
            System.out.println("Hasil Pengurangan : " + hasil);

        } else if (pilihan == 3) {
            int hasil = a * b;
            System.out.println("Hasil Perkalian : " + hasil);

        } else if (pilihan == 4) {
                double hasil = a / b;
                System.out.println("Hasil Pembagian : " + hasil);

        } else if (pilihan == 5) {
            int hasil = a % b;
            System.out.println("Hasil modulus atau sisa bagi : " + hasil);

        } else {
            System.out.println("Masukkan dengan benar");
        }
    }
}
