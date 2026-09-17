public class Day16 {
    public static void main(String[] args){
        int totalItem = 17;
        int kapasitasBox = 5;
        
        int sisaItem = totalItem % kapasitasBox;
        
        System.out.println("=== PROGRAM MODULUS (SISA BAGI) ===");
        System.out.println("Total item awal\t\t: " + totalItem);
        System.out.println("Kapasitas per box\t: " + kapasitasBox);
        System.out.println("Sisa item di luar box\t: " + sisaItem);
        
        int a = 22;
        boolean apakah = (a % 2 == 0);
        System.out.println("\nApakah angka " + a + " adalah genap? " + apakah);
        }
}