import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai mahasigma (-1 to stop): ");
            int a = input.nextInt();

            if (a == -1) {
                break;
            }

            if (a < 0 || a > 100) {
                System.out.println("Nilai tidak valid!");
                continue;
            }

            if (a == 40) {
                System.out.println("Program dihentikan karena nilai 40 ditemukan!");
                input.close();
                return;
            }

            System.out.println("Nilai mahasigma: " + a);
        }

        System.out.println("Pemeriksaan nilai selesai!");

        input.close();
    }
}