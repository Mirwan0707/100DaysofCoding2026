import java.util.Scanner;

public class Day085 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            angka[i] = input.nextInt();
        }

        int min = angka[0];

        for (int i = 1; i < 5; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }

        System.out.println("Angka terkecil: " + min);
    }
}
