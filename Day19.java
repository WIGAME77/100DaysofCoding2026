public class Day19 {
    public static void main(String[] args){
        double desimal = 99.85;
        int bulat = (int) desimal;
        
        System.out.println("Angka desimal awal\t: " + desimal);
        System.out.println("Hasil dipaksa ke int\t: " + bulat);
        
        int a = 130;
        byte b = (byte) a;
        
        System.out.println("\nNilai int awal\t\t: " + a);
        System.out.println("Hasil dipaksa ke byte\t: " + b);
    }
}