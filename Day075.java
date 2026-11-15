import java.util.Scanner;

public class Day075 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        System.out.print("Masukkan kata pembanding: ");
        String pembanding = input.nextLine();

        System.out.print("Masukkan huruf yang dicari: ");
        String huruf = input.nextLine();

        System.out.println("\n=== HASIL PENGECEKAN ===");
        System.out.println("equals: " + kata.equals(pembanding));
        System.out.println("equalsIgnoreCase: " + kata.equalsIgnoreCase(pembanding));
        System.out.println("contains: " + kata.contains(huruf));
        System.out.println("isEmpty: " + kata.isEmpty());

        input.close();
    }
}
