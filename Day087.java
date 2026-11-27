
import java.util.Scanner;

public class Day087 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka: ");
            angka[i] = input.nextInt();
        }

        System.out.print("Masukkan indeks yang ingin diubah: ");
        int indeks = input.nextInt();

        System.out.print("Masukkan angka baru: ");
        angka[indeks] = input.nextInt();

        System.out.println("Data array:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }

        input.close();
    }
}
