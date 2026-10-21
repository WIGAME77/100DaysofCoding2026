import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int a = input.nextInt();

        String hasil = (a % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Hasil: " + hasil);

        input.close();
    }
}