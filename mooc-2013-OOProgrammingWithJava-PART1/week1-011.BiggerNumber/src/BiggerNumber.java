
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
      
        
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.next());
        System.out.println("Type another number: ");
        int b = Integer.parseInt(reader.next());
        int c;
        if(a>b){
            c=a;
        }
        else{
            c=b;
        }
        
        System.out.println("The bigger number of the two numbers given was: "+c);
        

        // Implement your program here. Remember to ask the input from user
    }
}
