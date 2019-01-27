/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author lucariel
 */
public class Analysis {

    private File filname;
    private Scanner reader;

    public Analysis(File filname) {
        this.filname = filname;
    }

    public int lines() throws FileNotFoundException {
        reader = new Scanner(this.filname);
        int lin = 0;
        while (reader.hasNext()) {
            String wordOfText = reader.nextLine();
            lin++;
        }
        return lin;
    }

    public int characters() throws FileNotFoundException {
        reader = new Scanner(this.filname);
        int lin = 0;
        while (reader.hasNext()) {
            String wordOfText = reader.nextLine();

            for (int i = 0; i < wordOfText.length(); i++) {
                lin++;
            }
            lin++;
        }
        return lin;
    }
}
