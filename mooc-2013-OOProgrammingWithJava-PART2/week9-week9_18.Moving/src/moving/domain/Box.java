/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.*;
import moving.*;
/**
 *
 * @author lucariel
 */
public class Box implements Thing {
    
    private List <Thing> box = new ArrayList <Thing>();
    
    private int maximumCapacity;
    
     public Box(int maximumCapacity){
         
         this.maximumCapacity=maximumCapacity;
         
     }

     public boolean addThing(Thing thing){
         
         if(getVolume()+thing.getVolume()<=this.maximumCapacity){
             box.add(thing);
             return true;
         }
         else
             return false;
         
     }
     
     public int getVolume(){
         
         int res = 0;
         
         for (Thing t : box){
             res=res+t.getVolume();
         }
         
         return res;
     }
     
     public String toString(){
         return getVolume()+" size"+box.size();
     }
     
}