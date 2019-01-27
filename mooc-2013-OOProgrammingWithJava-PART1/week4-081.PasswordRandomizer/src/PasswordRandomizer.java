import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private String abc = "abcdefghijklmnopqrstuvwxyz";
    private int lenghtOfPass;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.lenghtOfPass = length;
    }

    public String createPassword() {
        String pass = "";
        for(int i = 0; i<this.lenghtOfPass;i++){
            pass = pass + this.abc.charAt(random.nextInt(this.abc.length()));
        }
        // write code that returns a randomized password
        return pass;
    }
}
