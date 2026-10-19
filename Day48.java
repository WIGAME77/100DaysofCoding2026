import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Pilih operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;
            case '-':
                System.out.println("Hasil: " + (a - b));
                break;
            case '*':
                System.out.println("Hasil: " + (a * b));
                break;
            case '/':
                System.out.println("Hasil: " + (a / b));
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }

        input.close();
    }
}