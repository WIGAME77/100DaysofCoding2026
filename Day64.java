import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println(faktorial);

        input.close();
    }
}