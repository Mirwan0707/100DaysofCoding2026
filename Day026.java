package pkg100dayscoding;

import java.util.Scanner;

public class Day026 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double PI = 3.14;
        double jariJari = input.nextDouble();

        double luas = PI * jariJari * jariJari;

        System.out.println(luas);
    }
}
