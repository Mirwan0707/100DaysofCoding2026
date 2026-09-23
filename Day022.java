package pkg100dayscoding;

public class Day022 {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;

        System.out.println("===Sebelum ditukar===");
        System.out.println("Nilai a : " + a);
        System.out.println("Nilai b : " + b);

        byte sementara = a;
        a = b;
        b = sementara;

        System.out.println("\n===Setelah ditukar===");
        System.out.println("Nilai a : " + a);
        System.out.println("Nilai b : " + b);
    }
}
