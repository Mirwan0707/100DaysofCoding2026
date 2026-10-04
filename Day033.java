package pkg100dayscoding;

import java.util.Scanner;

public class Day033 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur anda : ");
        int umur = sc.nextInt();

        if (umur >= 17) {
            System.out.println("Dewasa");
        } else {
            System.out.println("Anak-anak");
        }
    }
}
