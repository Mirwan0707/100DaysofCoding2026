package pkg100dayscoding;

import java.util.Scanner;

public class Day053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabungan;
        int total = 0;
        int pilihan;

        do {
            System.out.print("Masukkan uang tabungan: Rp");
            tabungan = sc.nextInt();

            total += tabungan;

            System.out.print("Ingin menabung lagi? (1 = Ya, 0 = Tidak): ");
            pilihan = sc.nextInt();

        } while (pilihan == 1);

        System.out.println("Total tabungan Dwi: Rp" + total);
    }
}
