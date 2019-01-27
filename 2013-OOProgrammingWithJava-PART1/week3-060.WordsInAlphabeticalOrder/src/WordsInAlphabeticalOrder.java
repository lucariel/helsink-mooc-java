
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word: ");
            String palabra = reader.nextLine();
            if("".equals(palabra)){
                break;
            }
            else{
            words.add(palabra);
            }
        }
        Collections.sort(words);
        System.out.println("You typed the following words: ");
        for(int i = 0 ; i<words.size(); i ++){
            
            System.out.println(words.get(i));
        }
    }
}
