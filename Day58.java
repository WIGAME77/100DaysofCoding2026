import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        for (int i = a; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = a; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}