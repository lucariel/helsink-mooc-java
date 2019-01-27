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

    private ArrayList<Participant> parts;
    private Scanner a;
    private int round;

    public TextUserInterface(Scanner reader) {
        parts = new ArrayList<Participant>();
        a = reader;

    }

    public void printParts() {
        for (Participant p : parts) {
            System.out.println("  " + p.getName());
            p.jump();
        }
    }

    public void start() {

        System.out.println("Kumpula ski jumping week");
        System.out.println("\nWrite the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.println("  Participant name:");
            String statement = a.nextLine();

            if (statement.equals("")) {
                break;
            } else {
                parts.add(new Participant(statement));

            }
        }
        System.out.println("The tournament begins!\n");
        round = 1;
        while (true) {
            Collections.sort(parts);

            System.out.println("Write \"jump\" to jump; otherwise you quit:\n");
            String statement = a.nextLine();
            if (statement.equals("jump")) {
                System.out.println("Round " + round);
                System.out.println("\nJumping order:");
                //this.printOrder();
                for (Participant p : parts) {
                    int position = parts.indexOf(p) + 1;
                    System.out.println("  " + position + ". " + p.toString());

                }

                System.out.println("\nResults of round " + this.round);
                this.printParts();

                this.round++;

            } else {
                System.out.println("Thanks!");
                break;
            }

        }
        Collections.sort(parts);
        Collections.reverse(parts);
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for (Participant p : parts) {
            int position = parts.indexOf(p) + 1;
            System.out.println(position + "           " + p.toString());
            System.out.println(p.getJumps());
        }

    }

}
