import java.util.Scanner;

public class SeparatingCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        
        for(int i = 0; i<word.length();i++){
            System.out.println((i+1)+". character: "+characters(word,i));
        }
    
    }
        
    public static char characters(String text, int ch){
        return text.charAt(ch);
    }
}
