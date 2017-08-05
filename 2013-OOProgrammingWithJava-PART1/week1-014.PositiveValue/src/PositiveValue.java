
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(":");
        
        
        int number = Integer.parseInt(reader.nextLine());
        
        if(number > 0){
            System.out.println("is positive");
        }
        else{
        System.out.println("is not positive");}

        // Type your program here:
    }
}
