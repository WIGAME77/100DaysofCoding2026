import java.util.Scanner;

public class Day42 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gp = input.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double t = input.nextDouble();

        System.out.print("Masukkan potongan: ");
        double p = input.nextDouble();

        double gajiKotor = gp + t;
        System.out.println("Gaji kotor: " + gajiKotor);
        double gajiBersih = gp + t - p;
        System.out.println("Gaji bersih: " + gajiBersih);

        input.close();
    }
}