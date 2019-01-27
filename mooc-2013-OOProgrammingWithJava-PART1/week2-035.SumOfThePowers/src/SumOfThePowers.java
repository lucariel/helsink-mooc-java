
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int r = 0;
        
        for(int i = 0; i<=n;i++){
            r = r+(int)Math.pow(2, i);
        }
        
        
        System.out.println("The result is "+r);
    }
}
