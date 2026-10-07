package pkg100dayscoding;

import java.util.Scanner;

public class Day036 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka bilangan: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }
}
