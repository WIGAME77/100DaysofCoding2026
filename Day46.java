import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MINUMAN ===");
        System.out.println("1. Kopi Hitam");
        System.out.println("2. Teh Manis");
        System.out.println("3. Jus Jeruk");
        System.out.print("Pilih menu (1-3)\t: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Pesanan Anda\t\t: Kopi Hitam");
                break;
            case 2:
                System.out.println("Pesanan Anda\t\t: Teh Manis");
                break;
            case 3:
                System.out.println("Pesanan Anda\t\t: Jus Jeruk");
                break;
            default:
                System.out.println("Keterangan\t\t: Menu tidak tersedia");
                break;
        }

        input.close();
    }
}