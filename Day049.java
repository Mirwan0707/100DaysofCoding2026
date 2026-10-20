
package pkg100dayscoding;

import java.util.Scanner;

public class Day049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        String hasil = (umur >= 17) ? "Dewasa" : "Belum dewasa";

        System.out.println(hasil);
    }
}
