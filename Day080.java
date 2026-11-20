import java.util.Scanner;

public class Day080 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.print("Masukkan indeks: ");
        int indeks = input.nextInt();

        System.out.println("Nilai: " + angka[indeks]);

        input.close();
    }
}
