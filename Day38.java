import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.print("Pilih menu (1/2)\t: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Pesanan Anda\t\t: Nasi Goreng");
        } else if (pilihan == 2) {
            System.out.println("Pesanan Anda\t\t: Mie Goreng");
        } else {
            System.out.println("Keterangan\t\t: Menu tidak tersedia");
        }

        input.close();
    }
}