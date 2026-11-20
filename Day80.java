import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50};

        System.out.print("Masukkan indeks (0-4): ");
        int b = input.nextInt();

        if (b >= 0 && b < a.length) {
            System.out.println("Nilai pada indeks " + b + " adalah: " + a[b]);
        } else {
            System.out.println("Indeks tidak valid!");
        }

        input.close();
    }
}