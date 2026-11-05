import java.util.Scanner;

public class Day065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}
