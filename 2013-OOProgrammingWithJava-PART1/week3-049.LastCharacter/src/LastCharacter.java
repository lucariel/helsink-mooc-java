import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        char lchar = lastCharacter(reader.nextLine());
        System.out.println("Last character:" + lchar);
        
    }
    public static char lastCharacter(String text){
        char lchar = text.charAt(text.length()-1);
        return lchar;
    }
    
}
