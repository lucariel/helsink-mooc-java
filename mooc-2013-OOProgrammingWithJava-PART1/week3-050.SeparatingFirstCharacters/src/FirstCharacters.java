import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int w;
        if(word.length()<3){
            w=0;
        }
        else{
            w=3;
        }
        for(int i = 0; i<w;i++){
            System.out.println((i+1)+". character: "+characters(word,i));
        }
    
    }
        
    public static char characters(String text, int ch){
        return text.charAt(ch);
    }
}
