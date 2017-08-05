
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius:");
        
        double number2 = Integer.parseInt(reader.nextLine());
        
        double result = Math.PI*number2*2;
        
        String toPrint = "Circumference of the circle:  "  + result ;
        
        
        System.out.println(toPrint);

        // Program your solution here 
    }
}
