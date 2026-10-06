import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka\t: ");
        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("Keterangan\t\t: Bilangan Genap");
        } else {
            System.out.println("Keterangan\t\t: Bilangan Ganjil");
        }

        input.close();
    }
}