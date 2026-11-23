import java.util.Scanner;

public class Day083 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            angka[i] = input.nextInt();
            total = total + angka[i];
        }

        System.out.println("Total: " + total);
    }
}
