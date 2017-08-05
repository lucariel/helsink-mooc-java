import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number");
        
        int factorial = 1;
        int n  = Integer.parseInt(reader.nextLine());
        
        if(n == 0){
            factorial = 1;
        }
        else{
            for(int i = n; i>0; i--){
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial is " + factorial);

    }
}
