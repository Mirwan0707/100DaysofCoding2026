import java.util.Scanner;

public class Day078 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Buat username: ");
        String user = input.nextLine();

        System.out.print("Buat password: ");
        String pw = input.nextLine();

        String u, p;

        do {
            System.out.print("\nUsername: ");
            u = input.nextLine();

            System.out.print("Password: ");
            p = input.nextLine();

            if (!p.equals(pw)) {
                System.out.println("Password salah!");
            } else if (!u.equals(user)) {
                System.out.println("Username salah!");
            }

        } while (!u.equals(user) || !p.equals(pw));

        System.out.println("Login berhasil!");

        input.close();
    }
}
