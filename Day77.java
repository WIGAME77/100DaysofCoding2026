import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        if (kalimat.isEmpty()) {
            System.out.println("Teks tidak boleh kosong!");
        } else {
            String bersih = kalimat.trim();
            System.out.println("Teks bersih      : " + bersih);
            System.out.println("Jumlah karakter  : " + bersih.length());
            System.out.println("Huruf kapital    : " + bersih.toUpperCase());
            System.out.println("Huruf kecil      : " + bersih.toLowerCase());
            System.out.println("Mengandung 'Java': " + bersih.toLowerCase().contains("java"));
            System.out.println("Ganti spasi (-)  : " + bersih.replace(" ", "-"));

            if (bersih.length() >= 5) {
                System.out.println("5 karakter awal  : " + bersih.substring(0, 5));
            }
        }

        input.close();
    }
}