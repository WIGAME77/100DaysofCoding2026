import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("1. Menu 1");
            System.out.println("2. Menu 2");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Menu 1...\n");
                    break;
                case 2:
                    System.out.println("Menu 2...\n");
                    break;
                case 3:
                    System.out.println("Keluar dari menu.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.\n");
            }
        } while (pilihan != 3);

        input.close();
    }
}