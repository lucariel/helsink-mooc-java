/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.LinkedList;

/**
 *
 * @author lucariel
 */
public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private LinkedList<Cow> cowList;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cowList = new LinkedList<Cow>();
    }

    public String getOwner() {
        return owner;
    }
    
    public void addCow(Cow cow){
        cowList.add(cow);
    }

    @Override
    public void liveHour() {
        for(Cow a : cowList){
            a.liveHour();
        }
    }
    public void manageCows(){
        this.barn.takeCareOf(cowList);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }
    public String toString(){
        String animals = "";
        for(Cow cow : cowList){
            animals=animals + "        "+cow.toString()+"\n";
        }
        return "Farm owner: "+this.getOwner()+"\nBarn bulk tank: "+this.barn.toString()+"\nAnimals: \n"+animals;
    }
    
}
