/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;


/**
 *
 * @author lucariel
 */
public class LengthAtLeast implements Criterion{
    private int l;

    public LengthAtLeast(int l) {
        this.l = l;
    }
    
    @Override
    public boolean complies(String line) {
       if(line.length()>=l){
           return true;
       } 
       else{
           return false;
       }
    }
    
}
