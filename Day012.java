package pkg100dayscoding;

import java.util.Scanner;

public class Day012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Masukkan nama anda : ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan NIM anda : ");
        String NIM = sc.nextLine();
        
        //maasukkan Kelas contoh : A
        System.out.print("Masukkan  Kelas 'A'\'B'\'C'\'D'  : ");
        char Kelas = sc.next().charAt(0);
        
        System.out.print("Masukan Umur Anda : ");  
        int umur = sc.nextInt();
       
        System.out.println("\n====BIODATA DIRI====");
        
        System.out.println("Nama     : "+ nama);
        System.out.println("NIM      : "+ NIM);
        System.out.println("Kelas    : "+ Kelas);
        System.out.println("Umur     : "+ umur);
         
    }
}
