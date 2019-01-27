/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;
/**
 *
 * @author lucariel
 */
public class AverageSensor implements Sensor {
    private List<Sensor> list;
    private List<Integer> readingList;
    
    
    
    public AverageSensor() {
	this.list = new ArrayList<Sensor>();
        this.readingList = new ArrayList<Integer>();
    }
    
    public List<Integer> readings(){
        
        return readingList;  
        
    }

    public boolean isOn() {
       boolean isOn = true;
       for(Sensor s : list){
           if(!s.isOn()){
               isOn = false;
           }
       }
       return isOn;
    }

    public void on() {
        for(Sensor s : list){
            s.on();
        }
    }

    public void off() {
        for(Sensor s : list){
            s.off();
        
        }
    }

    public int measure() {
        int totalM = 0;
        for(Sensor s : list){
            totalM = totalM + s.measure();
        }
        totalM/= list.size();
        readingList.add(totalM);
        return totalM;
    }
    public void addSensor(Sensor additional){
        list.add(additional);
        //readingList.add(this.measure());
    }
    
}
