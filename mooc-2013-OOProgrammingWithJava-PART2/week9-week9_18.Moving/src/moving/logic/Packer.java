/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import moving.domain.*;
import java.util.*;
import moving.domain.Box;
import moving.domain.Thing;
/**
 *
 * @author lucariel
 */
public class Packer {

    private int boxesVolume;
    
    public Packer(int boxesVolume){
        this.boxesVolume=boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
       
        List <Box> boxes = new ArrayList<Box>();
        
        Box b = new Box(boxesVolume);
        
        for (Thing t : things){
            
            if(b.addThing(t)==true){
               //b.addThing(t);
            }else{
                boxes.add(b);
                b= new Box(boxesVolume);
                b.addThing(t);
            }
            
            
        }
        
        boxes.add(b);
        
        return boxes;
        
    }
    
}