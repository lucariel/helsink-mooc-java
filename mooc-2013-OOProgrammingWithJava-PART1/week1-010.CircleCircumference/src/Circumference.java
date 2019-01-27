
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Type the radius: ");
        float r = Float.parseFloat(reader.nextLine());
        double circ = 2*r*Math.PI;
        
        System.out.println("Circumference of the circle: "+ circ);
    }
    
}
