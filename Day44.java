import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("Predikat: A");
        } else if (nilai >= 75) {
            System.out.println("Predikat: B");
        } else if (nilai >= 65) {
            System.out.println("Predikat: C");
        } else if (nilai >= 50) {
            System.out.println("Predikat: D");
        } else {
            System.out.println("Predikat: E");
        }

        input.close();
    }
}