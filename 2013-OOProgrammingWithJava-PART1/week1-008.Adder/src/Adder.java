    
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sum of the numbers:");
        
        int number1 = Integer.parseInt(reader.nextLine());
        int number2 = Integer.parseInt(reader.nextLine());
        
        int result = number1+number2;
        
        String toPrint = number1 + " + " + number2 + " = " + result;
        
        
        System.out.println(toPrint);

        // Implement your program here. Remember to ask the input from user
    }
}
