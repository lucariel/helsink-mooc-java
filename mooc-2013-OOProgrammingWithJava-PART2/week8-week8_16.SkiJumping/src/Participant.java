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

public class Participant implements Comparable<Participant> {

    private String name;
    private int score;
    public ArrayList<Integer> judges;
    public ArrayList<Integer> jumps;

    public int getScore() {
        return score;
    }
//  FALTA REVISAR ESTO
    public String getJumps() {
        String jps = "            jump lengths: ";
        for (int i = 0; i < jumps.size()-1; i++) {
            jps = jps + jumps.get(i)+" m, ";
            
        }
        jps = jps + jumps.get(jumps.size()-1)+" m";
        return jps;
    }

    public Participant(String name) {
        this.name = name;
        this.score = 0;
        this.judges = new ArrayList<Integer>();
        this.jumps = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.getName() + " (" + this.getScore() + " points)";
    }

    public void jump() {
        Random rand = new Random();
        int n = rand.nextInt(60) + 60;
        this.score = this.score + n;
        System.out.println("    length: " + n);
        jumps.add(n);
        for (int i = 0; i < 5; i++) {
            int points = rand.nextInt(10) + 10;
            judges.add(points);
        }
        Collections.sort(judges);
        System.out.println("    judge votes: " + judges.toString());
        for (int i = 1; i < judges.size() - 1; i++) {
            this.score = this.score + judges.get(i);
        }
        judges.clear();

    }

    @Override
    public int compareTo(Participant t) {
        return this.getScore() - t.getScore();
    }
}
