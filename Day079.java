import java.util.Scanner;

public class Day079 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai: ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        System.out.println("\nTotal: " + total);
        System.out.println("Rata-rata: " + (total / 5.0));

        input.close();
    }
}
