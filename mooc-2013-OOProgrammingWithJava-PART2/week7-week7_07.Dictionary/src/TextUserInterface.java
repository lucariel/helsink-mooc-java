/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
import java.util.*;

public class TextUserInterface {

    private Scanner a;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {

        a = reader;
        dict = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");

        while (true) {
            System.out.println("Statement");
            String statement = a.nextLine();

            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")) {
                System.out.println("In Finnish: ");
                String finnish = a.nextLine();
                System.out.println("Translation: ");
                String translation = a.nextLine();
                dict.add(finnish, translation);
            } else if (statement.equals("translate")) {
                System.out.println("Give a word: ");
                String word = a.nextLine();
                System.out.println(dict.translate(word));
            }
        }

    }

    public void add(String word, String translation) {
        dict.add(word, translation);

    }

    public void translate(String word) {
        dict.translate(word);
    }
}
