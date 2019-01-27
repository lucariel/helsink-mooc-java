
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean majority = false;
        // Type your program here 
        System.out.println("How old are you?");
        
        int age = Integer.parseInt(reader.nextLine());
        
        if(age >= 18){
            majority = true;
            System.out.println("You have reached the age of majority!");
        }
        else{
            System.out.println("You have not reached the age of majority yet!");
        }
        
    }
}
