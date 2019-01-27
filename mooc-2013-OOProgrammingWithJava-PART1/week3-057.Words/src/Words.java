import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
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
        for(String word : words){
            System.out.println(word);
        }
    }
}
