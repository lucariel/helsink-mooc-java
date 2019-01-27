import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int f = Integer.parseInt(reader.nextLine());
        int r=1;
        for(int i = 1; i<=f; i++){
            r=r*i;
        }
        System.out.println("Factorial is "+r);

    }
}
