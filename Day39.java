import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama\t: ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua\t: ");
        double b = input.nextDouble();

        System.out.println("Pilihan Operator (+, -, *, /)");
        System.out.print("Pilih operator\t\t: ");
        char op = input.next().charAt(0);

        double hasil = 0;

        if (op == '+') {
            hasil = a + b;
            System.out.println("Hasil\t\t\t: " + hasil);
        } else if (op == '-') {
            hasil = a - b;
            System.out.println("Hasil\t\t\t: " + hasil);
        } else if (op == '*') {
            hasil = a * b;
            System.out.println("Hasil\t\t\t: " + hasil);
        } else if (op == '/') {
            hasil = a / b;
            System.out.println("Hasil\t\t\t: " + hasil);
        } else {
            System.out.println("Keterangan\t\t: Operator tidak valid");
        }

        input.close();
    }
}