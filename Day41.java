import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu ruangan (°C)\t: ");
        double suhu = input.nextDouble();

        if (suhu >= 30) {
            System.out.println("Keterangan\t\t\t: Ruangan Panas");
        } else if (suhu >= 20) {
            System.out.println("Keterangan\t\t\t: Ruangan Normal");
        } else {
            System.out.println("Keterangan\t\t\t: Ruangan Dingin");
        }

        input.close();
    }
}