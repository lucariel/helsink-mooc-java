import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
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
        System.out.println("You typed the following words:");
        for(int i = words.size()-1;i>=0;i--){
            System.out.println(words.get(i));
        }
    }
}
