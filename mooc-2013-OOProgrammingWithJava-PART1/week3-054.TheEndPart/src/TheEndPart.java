import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String w = reader.nextLine();
        System.out.println("Length of the end part: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("Result: "+l(w,s));
        
        
    }
    
    public static String l(String a, int l){
        return a.substring(a.length() -l);
    
    }
}
