package pkg100dayscoding;

import java.util.Scanner;

public class Day030 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        System.out.println("Apakah " + a + " lebih besar atau sama dengan " + b + " : " + (a >= b));
        System.out.println("Apakah " + a + " lebih kecil atau sama dengan " + b + " : " + (a <= b));
    }
}
