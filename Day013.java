package pkg100dayscoding;
import java.util.Scanner;
public class Day15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       
     

        System.out.print("saldo awal : ");
        int awal = sc.nextInt();
        System.out.print("saldo masuk : ");
        int masuk = sc.nextInt();
        
        int akhir = awal + masuk;
        
        System.out.println(" saldo akhir : "+ akhir);
        
    }
    
}
