import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== FORMULIR BIODATA DIRI ===\n");
        System.out.print("Masukkan Nama\t: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM\t: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Umur\t: ");
        byte umur = input.nextByte();
        
        System.out.print("Masukkan Tinggi (cm)\t: ");
        double tinggi = input.nextDouble();
        
        System.out.println("\n=== HASIL CETAK BIODATA ===");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        
        System.out.printf("Umur\t\t: %d tahun%n", umur);
        System.out.printf("Tinggi Badan\t: %.1f cm%n", tinggi);
        input.close();
    }
}
