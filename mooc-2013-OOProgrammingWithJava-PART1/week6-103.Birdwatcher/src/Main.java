
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        birdWatcher jack = new birdWatcher();
        while (true) {
            System.out.println("?");
            String word = reader.nextLine();

            if (word.equals("Quit")) {
                break;

            } else if (word.equals("Add")) {
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin Name: ");
                String latinName = reader.nextLine();
                Bird b = new Bird(name, latinName);
                jack.add(b);

            } else if (word.equals("Observation")) {
                System.out.println("What was observed:?");
                String birdie = reader.nextLine();
                Bird a = jack.searchBird(birdie);
                jack.observ(a);

            } else if (word.equals("Statistics")) {
                jack.staticstics();

            } else if (word.equals("Show")) {
                System.out.println("What?");
                String birdie = reader.nextLine();
                Bird a = jack.searchBird(birdie);
                if (jack.isBird(birdie)) {
                    jack.show(a);
                }
            }

        }

    }

}
