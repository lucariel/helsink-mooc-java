/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
public class Thing {
    private int wiegth;
    private String name;

    public Thing(int wiegth, String name) {
        this.wiegth = wiegth;
        this.name = name;
    }

    public int getWiegth() {
        return wiegth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  wiegth +" ("+  name+")" ;
    }
        
    
}
