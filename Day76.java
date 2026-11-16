import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode mahasiswa: ");
        String kode = input.nextLine();

        String kodeBersih = kode.trim();
        String kodeGanti = kodeBersih.replace("-", "/");
        String kodePotong = kodeGanti.substring(0, 9);

        System.out.println("Setelah trim()      : " + kodeBersih);
        System.out.println("Setelah replace()   : " + kodeGanti);
        System.out.println("Setelah substring() : " + kodePotong);

        input.close();
    }
}