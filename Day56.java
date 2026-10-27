import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = a; i >= 1; i--) {
            System.out.print(i+" ");
        }

        input.close();
    }
}