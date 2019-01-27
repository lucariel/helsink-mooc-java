
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int n = Integer.parseInt(reader.nextLine());
        System.out.println("Last");
        int i = Integer.parseInt(reader.nextLine());
        
        for(int k = n; k<i+1; k++){
            System.out.println(k);
        }
        
      

        // write your code here

    }
}
