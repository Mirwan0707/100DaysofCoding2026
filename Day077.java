import java.util.Scanner;

public class Day077 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = input.nextLine().trim();

        System.out.println("Trim: " + teks);
        System.out.println("Uppercase: " + teks.toUpperCase());
        System.out.println("Lowercase: " + teks.toLowerCase());
        System.out.println("Length: " + teks.length());
        System.out.println("Replace: " + teks.replace("a", "o"));
        System.out.println("Substring: " + teks.substring(0, 5));
        System.out.println("Contains: " + teks.contains("Java"));
        System.out.println("Equals: " + teks.equals("Java"));
        System.out.println("IsEmpty: " + teks.isEmpty());

        input.close();
    }
}
