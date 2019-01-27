/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// @author lucariel
public class Thing {
    private int wiegth;
    private String name;

    public Thing(String name,int wiegth) {
        this.wiegth = wiegth;
        this.name = name;
    }

    public int getWeight() {
        return wiegth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name +" ("+ wiegth +" kg)" ;
    }
        
    
}
