
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:"); 
        System.out.println("Type another number:");
        
        int number1 = Integer.parseInt(reader.nextLine());
        int number2 = Integer.parseInt(reader.nextLine());
        
        int result;
        
        if(number1>number2){
            result = number1;
        }
        else{
            result = number2;
        }

        System.out.println("The bigger number of the two numbers given was:" + result); 

        // Implement your program here. Remember to ask the input from user
    }
}
