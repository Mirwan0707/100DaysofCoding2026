public class Day021 {
    public static void main(String[] args) {

        String teksByte = "10";
        String teksShort = "1000";
        String teksInt = "20000";
        String teksLong = "100000";
        String teksFloat = "10.5";
        String teksDouble = "20.5";
        String teksChar = "A";
        String teksBoolean = "true";

        byte angkaByte = Byte.parseByte(teksByte);
        short angkaShort = Short.parseShort(teksShort);
        int angkaInt = Integer.parseInt(teksInt);
        long angkaLong = Long.parseLong(teksLong);
        float angkaFloat = Float.parseFloat(teksFloat);
        double angkaDouble = Double.parseDouble(teksDouble);
        char angkaChar = teksChar.charAt(0);
        boolean angkaBoolean = Boolean.parseBoolean(teksBoolean);

        System.out.println("Byte: " + angkaByte);
        System.out.println("Short: " + angkaShort);
        System.out.println("Int: " + angkaInt);
        System.out.println("Long: " + angkaLong);
        System.out.println("Float: " + angkaFloat);
        System.out.println("Double: " + angkaDouble);
        System.out.println("Char: " + angkaChar);
        System.out.println("Boolean: " + angkaBoolean);
        
    }
}
