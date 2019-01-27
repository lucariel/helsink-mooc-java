import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        int greater;
        if(number1>number2){
            greater = number1;
            
            System.out.println("Greater number: "+greater);

        }
        else if (number1<number2){
            greater = number2;
            System.out.println("Greater number: "+greater);
        }
        else{
            greater = 0;
            System.out.println("The numbers are equal!");
        }
        
        
    }
}
