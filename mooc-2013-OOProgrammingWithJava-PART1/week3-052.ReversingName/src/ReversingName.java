import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        
        String word = reader.nextLine();
        System.out.println(reverse(word));
    }
    public static String reverse(String a){
        String rtd="";
        for(int i=a.length()-1;i>=0;i--){
            rtd=rtd+a.charAt(i);
        } 
        
        return rtd;
    
    }
}
