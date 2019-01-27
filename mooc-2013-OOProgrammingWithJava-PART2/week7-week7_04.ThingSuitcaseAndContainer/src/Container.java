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
public class Container {
    private int weightLimit;    
    private int totalWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();


    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int capacity = weightLimit - totalWeight;
        if (suitcase.totalWeight()<= capacity) {
            suitcases.add(suitcase);
            totalWeight = totalWeight + suitcase.totalWeight();
        }

    }
     public String toString() {
        if (suitcases.size() == 0) {
            return "empty (0 kg)";
        }
        if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase " + "(" + this.totalWeight + " kg)";
        } else {
            return suitcases.size() + " suitcases " + "(" + this.totalWeight + " kg)";
        }
    }
    public void printThings(){
        for(Suitcase thing : suitcases){
            thing.printThings();
        }
    }
    
}
