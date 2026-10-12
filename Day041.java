package pkg100dayscoding;

import java.util.Scanner;

public class Day041 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan temperatur ruangan: ");
        int suhu = sc.nextInt();

        if (suhu < 20) {
            System.out.println("Ruangan dingin");
        } else if (suhu <= 30) {
            System.out.println("Ruangan normal");
        } else {
            System.out.println("Ruangan panas");
        }
    }
}
