/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;
/**
 *
 * @author lucariel
 */
public class Thermometer implements Sensor {
    private boolean status;

    public Thermometer() {
        this.status = false;
    }
    @Override
    public boolean isOn() {
        if(this.status){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public int measure() {
        Random generator =  new Random();
        int roll = generator.nextInt(60) - 30;
        return roll;
    }
    
}
