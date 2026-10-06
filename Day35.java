import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur\t\t: ");
        int umur = input.nextInt();

        if (umur >= 17) {
            System.out.print("Apakah lulus ujian (true/false): ");
            boolean lulus = input.nextBoolean();

            if (lulus) {
                System.out.println("Keterangan\t\t: Selamat, Anda berhak mendapatkan SIM");
            } else {
                System.out.println("Keterangan\t\t: Maaf, Anda harus mengulang ujian SIM");
            }
        } else {
            System.out.println("Keterangan\t\t: Umur Anda belum cukup untuk membuat SIM");
        }

        input.close();
    }
}