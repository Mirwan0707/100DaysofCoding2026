import java.util.Scanner;

public class Day063 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int m = input.nextInt();

        System.out.print("Masukkan pangkat: ");
        int n = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * m;
        }

        System.out.println("Hasil: " + hasil);
    }
}
