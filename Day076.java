
import java.util.Scanner;

public class Day076 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode mahasiswa: ");
        String kode = input.nextLine();

        String bersih = kode.trim();
        String ganti = bersih.replace("-", "/");
        String hasil = ganti.substring(0, 9);

        System.out.println("Kode awal: " + kode);
        System.out.println("Setelah trim: " + bersih);
        System.out.println("Setelah replace: " + ganti);
        System.out.println("Substring: " + hasil);

        input.close();
    }
}
