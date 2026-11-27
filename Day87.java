import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50};

        System.out.println("Data awal:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\n\nPilih indeks yang ingin diubah (0-4): ");
        int b = input.nextInt();

        if (b >= 0 && b < a.length) {
            System.out.print("Masukkan nilai baru: ");
            int c = input.nextInt();
            a[b] = c;

            System.out.println("\nData setelah diubah:");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("Indeks tidak valid!");
        }

        input.close();
    }
}