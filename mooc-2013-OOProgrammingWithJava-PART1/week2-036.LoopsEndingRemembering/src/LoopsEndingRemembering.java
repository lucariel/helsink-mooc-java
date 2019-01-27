import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        int r = 0;
        int c = 0;
        float a;
        int odds=0;
        int even=0;
        while(true){
            int n = Integer.parseInt(reader.nextLine());
            if(n==-1){
                System.out.println("Thank you and see you later!");
                break;
            }
            else{
                r=r+n;
                c++;
                if(n%2==0){
                    even++;
                }
                else{
                    odds++;
                }
            }
        }
        a = (float)r/(float)c;
        System.out.println("The sum is: "+r);
        System.out.println("How many numbers: "+c);
        System.out.println("Average: "+a);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odds);

    }
}
