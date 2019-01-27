
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First:");
        int n1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second:");
        int n2 = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        for(int i = n1; i< n2+1; i++){
            sum = sum + i ;
        }
        
        System.out.println("The sum is "+ sum);
        
    }
}
