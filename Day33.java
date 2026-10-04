import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka\t: ");
        int a = input.nextInt();

        if (a > 0) {
            System.out.println("Keterangan\t\t: Bilangan Positif");
        } else {
            System.out.println("Keterangan\t\t: Bukan Bilangan Positif");
        }

        input.close();
    }
}