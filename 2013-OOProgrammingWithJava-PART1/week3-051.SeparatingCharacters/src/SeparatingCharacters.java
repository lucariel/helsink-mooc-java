
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        System.out.println("Type your name:");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        int nameLength = name.length()-1;
        int a = 1;
        while(nameLength >= 0){
            System.out.println(a+". character:" + name.charAt(a-1));
            nameLength--;
            a++;
        }
        
    }
}
