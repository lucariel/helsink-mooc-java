/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
public class BoundedCounter {
    private int value=0;
    private int upperlimit;
    
    public BoundedCounter(int upperlimit){
        this.upperlimit = upperlimit;
    }
    
    public void next(){
        if(this.value < this.upperlimit){
            this.value++;
        }
        else{
            this.value = 0;
        }
    }
    
    public String toString(){
        if(this.value < 10){
            return "0"+this.value;
        }
        else{
            return ""+this.value;
        }
    
        
    }
    public int getValue(){
            return this.value;
    }
    public void setValue(int value){
         if(value > 0 && value <= this.upperlimit){
             this.value = value;}

    }
    
    
}
