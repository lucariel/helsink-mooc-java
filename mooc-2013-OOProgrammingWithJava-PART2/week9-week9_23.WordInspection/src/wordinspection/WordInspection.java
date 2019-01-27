/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucariel
 */
public class WordInspection {

    private File filname;
    private Scanner reader;

    public WordInspection(File filname) {
        this.filname = filname;
    }

    public int wordCount() throws FileNotFoundException {
        reader = new Scanner(this.filname);
        int lin = 0;
        while (reader.hasNext()) {
            String wordOfText = reader.nextLine();
            lin++;
        }
        return lin;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        List l = new ArrayList<String>();

        reader = new Scanner(this.filname);
        while (reader.hasNext()) {
            String wordOfText = reader.nextLine();
            if (wordOfText.contains("z")) {
                l.add(wordOfText);
            }
        }
        return l;

    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        List l = new ArrayList<String>();

        reader = new Scanner(this.filname);
        while (reader.hasNext()) {
            String wordOfText = reader.nextLine();
            if (wordOfText.endsWith("l")) {
                l.add(wordOfText);
            }
        }
        return l;

    }

    public List<String> palindromes() throws FileNotFoundException {
        List l = new ArrayList<String>();

        reader = new Scanner(this.filname);
        while (reader.hasNext()) {
            String wordOfText = reader.nextLine();
            if (this.istPalindrom(wordOfText)) {
                l.add(wordOfText);
            }
        }
        return l;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List l = new ArrayList<String>();

        reader = new Scanner(this.filname);
        while (reader.hasNext()) {
            String wordOfText = reader.nextLine();
            if (this.containAllVowels(wordOfText)) {
                l.add(wordOfText);
            }
        }
        return l;

    }

    public boolean istPalindrom(String word) {
        int i1 = 0;
        int i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i1) != word.charAt(i2)) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    public boolean containAllVowels(String word) {

        if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")) {
            return true;
        }
        return false;
    }

}
