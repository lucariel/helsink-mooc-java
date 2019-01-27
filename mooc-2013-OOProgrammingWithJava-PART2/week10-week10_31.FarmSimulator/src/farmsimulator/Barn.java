/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;

/**
 *
 * @author lucariel
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot milkinRobot;

    public Barn(BulkTank tank) {
        this.tank = tank;
        this.milkinRobot = null;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkinRobot = milkingRobot;
        this.milkinRobot.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.milkinRobot == null){
            throw new IllegalStateException();
        }
        else{
            milkinRobot.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        for(Cow a : cows){
            this.takeCareOf(a);
        }
    }
    
    public String toString(){
        return this.tank.toString();
    }
    
}
