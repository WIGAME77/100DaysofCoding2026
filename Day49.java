import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int a = input.nextInt();

        String hasil = (a >= 75) ? "Lulus" : "Tidak Lulus";
        System.out.println("Hasil: " + hasil);

        input.close();
    }
}