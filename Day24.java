import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang\t: ");
        int p = input.nextInt();

        System.out.print("Masukkan lebar\t\t: ");
        int l = input.nextInt();

        int luas = p * l;

        System.out.println("Luas persegi panjang\t: " + luas);

        input.close();
    }
}