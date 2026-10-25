
package pkg100dayscoding;

import java.util.Scanner;

public class Day054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 1 && n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1) {
            System.out.println("Pangkat dua");
        } else {
            System.out.println("Bukan pangkat dua");
        }
    }
}
