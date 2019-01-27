/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Printer {

    private File filname;
    private Scanner reader;

    public Printer(String fileName) throws Exception {
        // ...
        filname = new File(fileName);

    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        int lin = 0;

        reader = new Scanner(this.filname);
        while (reader.hasNext()) {
            
            String wordOfText = reader.nextLine();
            if (wordOfText.contains(word) || wordOfText.equals(word)) {
                System.out.println(wordOfText);
            }
        }
    }

}
