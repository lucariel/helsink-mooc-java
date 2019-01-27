/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;

/**
 *
 * @author lucariel
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private Collection<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    @Override
    public void add(Thing thing) {
        if(thing.getWeight()<=this.maxWeight){
            things.add(thing);
            this.maxWeight-=thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.things.contains(thing)){
            return true;
        }
        else{
            return false;
        }
        
    }
    public void printThings(){
        for(Thing t : things){
            System.out.println(t.getName());
        }
    }
    
}
