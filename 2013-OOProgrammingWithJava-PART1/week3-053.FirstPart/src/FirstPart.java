
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        System.out.println("Type a word: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println("Length of the first part: ");
        int l = Integer.parseInt(reader.nextLine());
        String result = word.substring(0,l);
        System.out.println("Result: " + result );
        
        
    }
}
