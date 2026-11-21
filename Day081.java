import java.util.Scanner;

public class Day081 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\n=== ISI ARRAY ===");

        for (int i = 0; i < 5; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": " + angka[i]);
        }

        input.close();
    }
}
