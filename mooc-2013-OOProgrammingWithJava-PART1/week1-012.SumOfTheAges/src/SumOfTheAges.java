
import java.util.Scanner;

public class SumOfTheAges {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        /* Implement your program here
        Type your name: Matti
Type your age: 14

Type your name: Arto
Type your age: 12

Matti and Arto are 26 years old in total.*/
        
        System.out.println("Type your name: ");
        String nombreA = reader.next();
        System.out.println("Type your age:  ");
        int edadA = Integer.parseInt(reader.next());
        
        
        System.out.println("Type your name: ");
        String nombreB = reader.next();
        System.out.println("Type your age:  ");
        int edadB = Integer.parseInt(reader.next());
        
        int sumaedad=edadA+edadB;
        
        
        System.out.println(nombreA+" and "+nombreB+" are "+sumaedad+" years old in total.");
        
        
        
        
    }
}
