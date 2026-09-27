import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        // SOAL 2 EVALUASI
        Scanner input = new Scanner(System.in);
        final double pi = 3.14;
        double j = input.nextDouble();
        double l = pi * j * j;
        System.out.print(l);
        input.close();
    }
}
