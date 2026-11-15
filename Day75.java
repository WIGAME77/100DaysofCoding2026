import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = input.nextLine();

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        System.out.print("Masukkan program studi: ");
        String prodi = input.nextLine();

        if (username.isEmpty()) {
            System.out.println("Username wajib diisi");
        }

        if (password.equals("Java123")) {
            System.out.println("Password benar");
        }

        if (prodi.equalsIgnoreCase("informatika")) {
            System.out.println("Program studi sesuai");
        }

        if (prodi.contains("Teknik")) {
            System.out.println("Berada di Fakultas Teknik");
        }

        if (!username.isEmpty() && !password.isEmpty() && password.equals("Java123")) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

        input.close();
    }
}