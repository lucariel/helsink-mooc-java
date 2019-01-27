
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write test code here
        System.out.println("Give a String");
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String b = a.nextLine();
            if(clockTime(b)){
                System.out.println("The form is fine.");
            }
            else{
                System.out.println("The form is wrong.");
            }
        }
       
        
    }
    
    public static boolean isAWeekDay(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean allVowels(String string){
        if(string.matches("(a|e|i|o|u|ä|ö)*")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean clockTime(String string){
        if(string.matches("([0-1][0-9]):([0-5][0-9]):([0-5][0-9])")){
            return true;
        }else if(string.matches("(2[0-3]):([0-5][0-9]):([0-5][0-9])")){
            return true;
        }
        else{
            return false;
        }
    }
}
