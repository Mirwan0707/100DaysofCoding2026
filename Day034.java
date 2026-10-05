package pkg100dayscoding;

import java.util.Scanner;

public class Day034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur anda : ");
        int umur = sc.nextInt();

        if (umur >= 18) {
            System.out.println("Anda sudah dewasa");
          
        } else if (umur >= 16) {
            System.out.println("Anda sudah remaja");
          
        } else {
            System.out.println("Anda masih anak-anak");
        }
      
    }
}
