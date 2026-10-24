import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int lanjut;

        do {
            System.out.print("Masukkan jumlah uang: ");
            int uang = input.nextInt();
            total += uang;

            System.out.print("Ingin menabung lagi? (1 = lanjut, 0 = berhenti): ");
            lanjut = input.nextInt();
        } while (lanjut == 1);

        System.out.println("Total tabungan: " + total);

        input.close();
    }
}