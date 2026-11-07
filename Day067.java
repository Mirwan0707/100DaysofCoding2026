package pkg100dayscoding;

import java.util.Scanner;


public class Day067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka untuk ukuran persegi : ");
        int p = sc.nextInt();
        
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
}
