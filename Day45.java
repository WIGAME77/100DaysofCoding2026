import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode angka (1-3): ");
        int kode = input.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Pilihan\t\t\t : Jalur Satu");
                break;
            case 2:
                System.out.println("Pilihan\t\t\t : Jalur Dua");
                break;
            case 3:
                System.out.println("Pilihan\t\t\t : Jalur Tiga");
                break;
            default:
                System.out.println("Keterangan\t\t: Kode tidak valid");
                break;
        }

        input.close();
    }
}