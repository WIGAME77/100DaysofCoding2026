import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        a++;
        b--;
        int c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        input.close();
    }
}
