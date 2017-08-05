import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:"); 
        
        
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number:");
        int number2 = Integer.parseInt(reader.nextLine());
        
        
        if(number1>number2){
            System.out.println(number1+" is bigger");
        }
        else if(number1<number2){
            System.out.println(number2+" is bigger");
        }
        else{
            System.out.println("The numbers are equal!");
        }


    }
}
