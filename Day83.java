import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        int[] a = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            a[i] = input.nextInt();
            total += a[i];
        }

        System.out.println("Total penjumlahan: " + total);

        input.close();
    }
}