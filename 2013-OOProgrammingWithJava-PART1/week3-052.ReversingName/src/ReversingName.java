import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        for(int i = name.length()-1; i>=0 ; i--){
            System.out.print(name.charAt(i));
        }
        
    }
}
