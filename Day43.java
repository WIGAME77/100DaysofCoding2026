import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka\t: ");
        int angka = input.nextInt();

        if (angka % 15 == 0) {
            System.out.println("Keterangan\t\t: Kelipatan 15");
        } else if (angka % 3 == 0) {
            System.out.println("Keterangan\t\t: Kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println("Keterangan\t\t: Kelipatan 5");
        } else {
            System.out.println("Keterangan\t\t: Bukan kelipatan 3, 5, maupun 15");
        }

        input.close();
    }
}