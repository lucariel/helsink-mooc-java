
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String simleyFace = ":)";
        String firstLine = ":):):)";
        String secondLine = ":) " + characterString;
        for (int i = 0; i < characterString.length(); i++) {
            if (i % 2 == 0) {
                firstLine = firstLine + simleyFace;
            }
        }
        if (characterString.length() % 2 == 0) {
            secondLine = secondLine +" "+ simleyFace;
        } else {
            secondLine = secondLine + "  " + simleyFace;
        }

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(firstLine);
    }

}
