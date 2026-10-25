import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if(y > x) {
            x++;
            if(z > x){
                System.out.println(x+2);
            }
        }else if(y < x){
            x--;
            if(z < x){
                System.out.println(x-2);
            }
        }
        input.close();
    }
}