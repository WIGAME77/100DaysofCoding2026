public class Day32 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean hasil1 = (a > b) && (a % 2 == 0);

        boolean hasil2 = (a < b) || (b % 2 != 0);

        System.out.println("Nilai a\t\t\t\t: " + a);
        System.out.println("Nilai b\t\t\t\t: " + b);
        System.out.println("a > b DAN a genap?\t\t: " + hasil1);
        System.out.println("a < b ATAU b ganjil?\t\t: " + hasil2);
    }
}