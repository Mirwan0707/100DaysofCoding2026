import java.util.Scanner;

public class Day084 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka: ");
            angka[i] = input.nextInt();
        }

        int max = angka[0];

        for (int i = 0; i < 5; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("Angka terbesar: " + max);

        input.close();
    }
}
