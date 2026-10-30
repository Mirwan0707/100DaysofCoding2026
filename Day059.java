
import java.util.Scanner;

public class Day059 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan M: ");
        int m = input.nextInt();

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
