
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word: ");
            String palabra = reader.nextLine();
            if(words.contains(palabra)){
                break;
            }
            else{
            words.add(palabra);
            }
        }
        System.out.println("You typed the following words: ");
        for(int i = 0 ; i<words.size(); i ++){
            
            System.out.println(words.get(i));
        }
    }
}
