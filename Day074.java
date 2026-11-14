
import java.util.Scanner;

public class Day074 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Judul buku: ");
        String judul = input.nextLine();

        System.out.println("Kapital: " + judul.toUpperCase());
        System.out.println("Kecil: " + judul.toLowerCase());
        System.out.println("Jumlah: " + judul.length());

        if (judul.length() > 20) {
            System.out.println("Judul cukup panjang");
        } else {
            System.out.println("Judul tidak terlalu panjang");
        }
    }
}
