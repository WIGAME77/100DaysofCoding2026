import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan PIN: ");
        int pin = input.nextInt();

        while (pin != 5421) {
            System.out.print("PIN salah, masukkan lagi: ");
            pin = input.nextInt();
        }

        System.out.println("PIN benar, berhasil masuk!");

        input.close();
    }
}