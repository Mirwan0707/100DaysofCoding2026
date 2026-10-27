
package pkg100dayscoding;

import java.util.Scanner;

public class Day056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        System.out.println("Urutan 1 sampai N:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nUrutan N sampai 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
