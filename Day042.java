package pkg100dayscoding;

import java.util.Scanner;

public class Day042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        int gaji = sc.nextInt();

        int potongan = gaji * 10 / 100;
        int gajiBersih = gaji - potongan;

        System.out.println("Potongan gaji: Rp" + potongan);
        System.out.println("Gaji bersih: Rp" + gajiBersih);
    }
}
