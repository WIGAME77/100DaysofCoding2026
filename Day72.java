import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int n;

        while (true) {
            n = input.nextInt();
            if (n < 0) {
                break;
            }
            total += n;
        }

        System.out.println(total);

        input.close();
    }
}