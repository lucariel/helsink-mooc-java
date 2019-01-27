
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        String name1 = reader.nextLine();
        int age1 = Integer.parseInt(reader.nextLine());
        String name2 = reader.nextLine();
        int age2 = Integer.parseInt(reader.nextLine());
        
        
        System.out.println("Type your name:"); 
        System.out.println("Type your age:");     
        
        
        System.out.println("Type your name:"); 
        System.out.println("Type your age:");     
        
        int result = age1+age2;


        
        
        
        System.out.println(name1+" and " +name2+ " are "+result+" years old in total.");
    }
}
