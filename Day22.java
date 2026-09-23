public class Day22 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("=== SEBELUM DITUKAR ===");
        System.out.println("Nilai a\t: " + a);
        System.out.println("Nilai b\t: " + b);

        // Proses penukaran nilai
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\n=== SETELAH DITUKAR ===");
        System.out.println("Nilai a\t: " + a);
        System.out.println("Nilai b\t: " + b);
    }
}