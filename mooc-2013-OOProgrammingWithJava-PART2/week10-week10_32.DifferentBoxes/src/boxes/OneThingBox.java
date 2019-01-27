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
public class OneThingBox extends Box {
    private Collection<Thing> things;
    
    public OneThingBox(){
        this.things = new ArrayList<Thing>();
    }
    
    
    @Override
    public void add(Thing thing) {
        if(this.things.size()==0){
            this.things.add(thing);
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
}
