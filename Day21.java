public class Day21 {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "200";
        String s3 = "1000";
        String s4 = "50000";
        String s5 = "12.5f";
        String s6 = "99.9";
        String s7 = "true";
        String s8 = "A";

        byte a = Byte.parseByte(s1);
        short b = Short.parseShort(s2);
        int c = Integer.parseInt(s3);
        long d = Long.parseLong(s4);
        float e = Float.parseFloat(s5);
        double f = Double.parseDouble(s6);
        boolean g = Boolean.parseBoolean(s7);
        char h = s8.charAt(0);

        System.out.println("Hasil byte a\t: " + a);
        System.out.println("Hasil short b\t: " + b);
        System.out.println("Hasil int c\t: " + c);
        System.out.println("Hasil long d\t: " + d);
        System.out.println("Hasil float e\t: " + e);
        System.out.println("Hasil double f\t: " + f);
        System.out.println("Hasil boolean g\t: " + g);
        System.out.println("Hasil char h\t: " + h);
    }
}
