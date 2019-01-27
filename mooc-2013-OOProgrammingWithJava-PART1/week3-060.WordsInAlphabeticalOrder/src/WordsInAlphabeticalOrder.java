
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word: ");
        
        while(true){
            String w = reader.nextLine();
            if(w.isEmpty()){
                break;
            }
            else{
                words.add(w);
            }
            
        }
        Collections.sort(words);
        System.out.println("You typed the following words:");
        for(String word : words){
            System.out.println(word);
        }
    }
}
