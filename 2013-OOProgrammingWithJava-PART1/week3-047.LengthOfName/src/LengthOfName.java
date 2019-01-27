
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int length = calculateCharacters(reader.nextLine());
        System.out.println("Number of characters: " + length);
    }
    
    public static int calculateCharacters(String text){
        return text.length();
    }
    
}
