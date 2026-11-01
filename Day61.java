import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        System.out.println(total);

        input.close();
    }
}