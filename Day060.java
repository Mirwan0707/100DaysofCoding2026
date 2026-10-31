import java.util.Scanner;

public class Day060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            jumlah += i;
            System.out.print(jumlah + " ");
        }

        System.out.println("\nTotal: " + jumlah);
    }
}
