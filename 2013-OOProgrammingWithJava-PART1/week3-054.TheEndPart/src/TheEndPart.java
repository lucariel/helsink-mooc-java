import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        System.out.println("Type a word: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println("Length of the end part: ");
        int l = Integer.parseInt(reader.nextLine());
        String result = word.substring(word.length() - l);
        System.out.println("Result: " + result );
    }
}
