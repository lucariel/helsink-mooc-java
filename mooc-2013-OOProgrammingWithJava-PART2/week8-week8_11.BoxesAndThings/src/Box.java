/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
import java.util.ArrayList;

public class Box implements ToBeStored{

    private double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing) {
        double currentCapacity = maxWeight - this.weight();
        if (thing.weight() < currentCapacity) {
            things.add(thing);
        }

    }

    public String toString() {
        //Box: 6 things, total weight 4.0 kg
        
        return "Box: " + this.things.size() + " things, total weight " + this.weight() + " kg";
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored thing : things) {
            weight = weight + thing.weight();
        }
        return weight;
    }

}
