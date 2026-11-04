import java.util.Scanner;

public class Day064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println("Hasil faktorial: " + hasil);
    }
}
