public class Day31 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean hasilAnd = a && b;
        boolean hasilOr  = a || b;
        boolean hasilNot = !a;

        System.out.println("a\t\t: " + a);
        System.out.println("b\t\t: " + b);
        System.out.println("a && b (AND)\t: " + hasilAnd);
        System.out.println("a || b (OR)\t: " + hasilOr);
        System.out.println("!a     (NOT)\t: " + hasilNot);
    }
}