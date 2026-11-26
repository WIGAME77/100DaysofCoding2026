import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = {7, 17, 27, 77, 127, 177};

        System.out.print("Masukkan angka yang dicari: ");
        int b = input.nextInt();

        boolean ketemu = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("Angka " + b + " ditemukan pada indeks ke-" + i);
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Angka " + b + " tidak ditemukan dalam array.");
        }

        input.close();
    }
}