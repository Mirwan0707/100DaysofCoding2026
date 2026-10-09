
package pkg100dayscoding;

import java.util.Scanner;

public class Day038 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng    Rp.13.000");
        System.out.println("2. Mie Ayam       Rp.15.000");
        System.out.println("3. Ayam Geprek    Rp.10.000");
        System.out.println("4. Mie Bakso      Rp.15.000");

        System.out.print("Pilih makanan 1-4: ");
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("\n1. Nasi Goreng Rp.13.000");

        } else if (a == 2) {
            System.out.println("\n2. Mie Ayam Rp.15.000");

        } else if (a == 3) {
            System.out.println("\n3. Ayam Geprek Rp.10.000");

        } else if (a == 4) {
            System.out.println("\n4. Mie Bakso Rp.15.000");

        } else {
            System.out.println("Pilihan tidak tersedia!");
        }

        
    }
}
