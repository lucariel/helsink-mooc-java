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

public class Suitcase {

    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int weightLimit;
    private int totalWeight;

    public int totalWeight() {
        return totalWeight;
    }

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    @Override
    public String toString() {
        if (things.size() == 0) {
            return "empty (0 kg)";
        }
        if (things.size() == 1) {
            return things.size() + " thing " + "(" + this.totalWeight + " kg)";
        } else {
            return things.size() + " things " + "(" + this.totalWeight + " kg)";
        }
    }

    public void addThing(Thing thing) {
        int capacity = weightLimit - totalWeight;
        if (thing.getWeight() <= capacity) {
            things.add(thing);
            totalWeight = totalWeight + thing.getWeight();
        }

    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }

    public Thing heaviestThing() {
        if (things.size() > 0) {
            Thing heaviest = things.get(0);
            for (Thing thing : things) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
            return heaviest;
        }
        else{
            return null;
        }
    }
}
