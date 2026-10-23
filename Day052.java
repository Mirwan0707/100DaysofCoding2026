
package pkg100dayscoding;

import java.util.Scanner;

public class Day052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
    System.out.print("Masukkan Pin : ")
    int pin = sc.nextInt();  
        
       
  
        while ( pin != 5421 ){            
            System.out.println("Pin Salah, Coba Lagi!");

            System.out.print("Masukkan Pin : ");
           pin = sc.nextInt();  
        }
        
        System.out.println("Pin benar");
       
        

    }
}
