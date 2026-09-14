import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        // Soal1
        System.out.println("nama\tjurusan");
        System.out.println("sela\tinformatika");
        System.out.print("meli\tinformatika");

        // Soal2
        int stok = 20;
        double harga = 25.500;
        float berat = 3.5f;

        System.out.println("Jumlah stok = "+stok);
        System.out.printf("Harga barang = %.3f\n",harga);
        System.out.println("Berat barang = "+berat+" kg");

        // Soal3
        String name = "Dwi";
        String nim = "D0225330";
        byte umur = 19;
        String ipk = "3.89";
        String jk = "P";

        System.out.println("===INFORMASI MAHASISWA===");
        System.out.printf("Nama\t      :%s",name);
        System.out.printf("\nNIM\t      :%s",nim);
        System.out.printf("\numur\t      :%s",umur);
        System.out.printf("\nipk\t      :%s",ipk);
        System.out.printf("\nJenis kelamin :%s",jk);

        // Soal4
        int a = 25000;
        System.out.println("\nSaldo awal: "+a);
        int b = 20000;
        System.out.println("Saldo masuk: "+b);
        a = 45000;
        System.out.println("Saldo akhir: "+a);

        // Soal5
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pemesan : ");
        String nama = input.nextLine();
        System.out.print("Masukkan nama makanan : ");
        String mkn = input.nextLine();
        System.out.print("Masukkan jumlah : ");
        
        int jumlah = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan kode pesanan : ");
        String kode = input.nextLine();

        System.out.println("\n===DATA PESANAN===");
        System.out.println("Nama pemesan : "+nama);
        System.out.println("Makanan : "+mkn);
        System.out.println("Jumlah pesanan : "+jumlah);
        System.out.println("Kode pesanan : "+kode);


        input.close();
    }
}
