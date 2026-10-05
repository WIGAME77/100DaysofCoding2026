import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka\t: ");
        int a = input.nextInt();

        if (a > 0) {
            System.out.println("Keterangan\t\t: Bilangan Positif");
        } else if (a < 0) {
            System.out.println("Keterangan\t\t: Bilangan Negatif");
        } else {
            System.out.println("Keterangan\t\t: Angka Nol");
        }

        input.close();
    }
}