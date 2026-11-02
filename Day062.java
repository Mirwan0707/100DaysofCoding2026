package pkg100dayscoding;

import java.util.Scanner;

public class Day062 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int m = input.nextInt();

        System.out.print("Masukkan jumlah laporan per mahasiswa : ");
        int n = input.nextInt();

        System.out.println("\n--- DAFTAR TUGAS MAHASISWA ---");

        for (int i = 1; i <= m; i++) {
            System.out.println("Mahasiswa ke-" + i + ":");

            for (int j = 1; j <= n; j++) {
                System.out.println("   - Laporan " + j);
            }
        }
    }
}
