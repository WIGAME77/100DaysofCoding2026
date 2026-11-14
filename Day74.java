import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();

        int panjang = judul.length();

        System.out.println("Huruf kapital    : " + judul.toUpperCase());
        System.out.println("Huruf kecil      : " + judul.toLowerCase());
        System.out.println("Jumlah karakter  : " + panjang);

        if (panjang > 20) {
            System.out.println("Judul buku cukup panjang");
        } else {
            System.out.println("Judul buku tidak terlalu panjang");
        }

        input.close();
    }
}