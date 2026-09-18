public class Day17 {
    public static void main(String[] args){
        int b;
        b = 50;
        System.out.println("b awal\t\t: " + b);
        
        b += 10;
        System.out.println("Setelah b += 10\t: " + b);
        
        b -= 20;
        System.out.println("Setelah b -= 20\t: " + b);
        
        b *= 2;
        System.out.println("Setelah b *= 2\t: " + b);
        
        b /= 4;
        System.out.println("Setelah b /= 4\t: " + b);
        b %= 3;
        System.out.println("Setelah b %= 3\t: " + b);
    }
}