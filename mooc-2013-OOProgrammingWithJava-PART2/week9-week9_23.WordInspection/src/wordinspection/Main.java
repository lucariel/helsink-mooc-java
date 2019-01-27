package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection insp = new WordInspection(file);
        //System.out.println(insp.wordCount());
        System.out.println(insp.wordsWhichContainAllVowels());

    }
}
