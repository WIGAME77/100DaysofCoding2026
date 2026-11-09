import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka N: ");
        int n = input.nextInt();
        System.out.println("Bilangan ganjil dari "+n+" sampai 1:");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Bilangan genap dari "+n+" sampai 1:");
        for (int j = n; j >= 1; j--) {
            if (j % 2 == 0) {
                    System.out.print(j+" ");
                }
            }
            input.close();
    }
}
