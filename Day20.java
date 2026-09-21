public class Day20 {
    public static void main(String[] args){
        int a = 77;
        double b = 4.69;
        
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        
        System.out.println("Hasil s1\t: " + s1);
        System.out.println("Hasil s2\t: " + s2);
        
        boolean x = true;
        char y = 'A';
        
        String s3 = x + "";
        String s4 = y + "";
        
        System.out.println("\nHasil s3\t: " + s3);
        System.out.println("Hasil s4\t: " + s4);
    }
}
