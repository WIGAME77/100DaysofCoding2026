import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== BUAT AKUN BARU ===");
        System.out.print("Buat Username: ");
        String regUser = input.nextLine();
        System.out.print("Buat Password: ");
        String regPass = input.nextLine();

        System.out.println("\n=== SILAKAN LOGIN ===");
        while (true) {
            System.out.print("Masukkan Username: ");
            String loginUser = input.nextLine();
            System.out.print("Masukkan Password: ");
            String loginPass = input.nextLine();

            if (loginUser.equals(regUser) && loginPass.equals(regPass)) {
                System.out.println("Login berhasil! Selamat datang di welcome " + regUser);
                break;
            } else {
                System.out.println("Username atau password salah, silakan coba lagi.\n");
            }
        }

        input.close();
    }
}