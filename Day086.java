import java.util.Scanner;

public class Day086 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka: ");
            angka[i] = input.nextInt();
        }

        System.out.print("Masukkan indeks: ");
        int indeks = input.nextInt();

        System.out.println("Elemen: " + angka[indeks]);

        input.close();
    }
}
