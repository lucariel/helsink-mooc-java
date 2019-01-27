
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        float a = Float.parseFloat(reader.nextLine());
        System.out.println("Type another number:");
        float b = Float.parseFloat(reader.nextLine());
        float suma = a/b;
        
        System.out.println("Division: "+a+" / "+b+" = "+suma);
        

        // Implement your program here. Remember to ask the input from user.
    }
}
