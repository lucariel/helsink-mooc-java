
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int year = Integer.parseInt(reader.nextLine());
        boolean leap = false;
        
        if(year%4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leap = true;
                }
             
            }
            else{
                leap = true;
            }
           
        }
        
        if(leap){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is NOT a leap year");
        }
        

        
        

    }
}
