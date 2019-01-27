
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        
        System.out.println("Type the first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        
        System.out.println("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        
        System.out.println("Type the third number:");
        int number3 = Integer.parseInt(reader.nextLine());
        
        sum = number1 + number2 + number3;
        
        System.out.println("sum: "+sum);
        


        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
