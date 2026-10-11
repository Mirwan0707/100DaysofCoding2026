package evaluasi2;

import java.util.Scanner;

public class soalNo5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.print("Masukkan nilai uts : ");
        int a =  sc.nextInt();
      
        if ( a > 85) {
            System.out.println("A");
            
        }else if(a >= 70 && a <= 85){
            System.out.println("B");
            
        }else if(a >= 60 && a <= 69){
            System.out.println("C");
            

            
        }else{
            System.out.println("Tidak Lulus");
        }
     
      
      
    }
}
