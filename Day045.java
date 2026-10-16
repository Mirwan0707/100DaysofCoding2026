
package pkg100dayscoding;

import java.util.Scanner;

public class Day045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Bakso");
        System.out.println("4. Soto");
        System.out.print("Pilih menu: ");

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Goreng");
                break;
            case 3:
                System.out.println("Anda memilih Bakso");
                break;
            case 4:
                System.out.println("Anda memilih Soto");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}
