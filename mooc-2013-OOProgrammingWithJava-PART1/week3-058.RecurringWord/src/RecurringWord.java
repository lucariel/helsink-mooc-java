
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word: ");
        
        while(true){
            String w = reader.nextLine();
            if(words.contains(w)){
                break;
            }
            else{
                words.add(w);
            }
            
        }
        System.out.println("You typed the following words:");
        for(String word : words){
            System.out.println(word);
        }
        
    }
}
