import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari\t: ");
        double r = input.nextDouble();

        double luas = Math.PI * r * r;

        System.out.println("Luas lingkaran\t\t: " + luas);

        input.close();
    }
}