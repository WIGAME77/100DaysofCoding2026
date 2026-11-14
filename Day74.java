import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String teks = input.nextLine();

        System.out.println("Panjang karakter : " + teks.length());
        System.out.println("Huruf kapital    : " + teks.toUpperCase());
        System.out.println("Huruf kecil      : " + teks.toLowerCase());

        input.close();
    }
}