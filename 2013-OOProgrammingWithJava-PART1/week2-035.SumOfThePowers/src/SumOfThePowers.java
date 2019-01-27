
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        double sum = 0;
        
        for(int i = n ; i >= 0; i--){
            double j = Math.pow(2, i);
            sum = sum + j;
            
        }
        
        System.out.println("The result is: " + (int) sum);

    }
}
