import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            a[i] = input.nextInt();
        }

        System.out.println("\nIsi array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        input.close();
    }
}