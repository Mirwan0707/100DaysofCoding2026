package pkg100dayscoding;

import java.util.Scanner;

public class Day035 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        if (umur >= 17) {
            System.out.print("Masukkan nilai: ");
            int nilai = sc.nextInt();

            if (nilai >= 70) {
                System.out.println("Dewasa dan lulus");
            } else {
                System.out.println("Dewasa tetapi tidak lulus");
            }

        } else {
            System.out.println("Belum dewasa");
        }
    }
}
