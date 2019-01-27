/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author lucariel
 */
public class BulkTank {

    private double capacity;
    private double volume;

    public double getVolume() {
        return volume;
    }

    public BulkTank() {
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchFreeSpace() {
        return this.getCapacity() - this.getVolume();
    }

    public void addToTank(double amount) {
        if (amount > this.howMuchFreeSpace()) {
            this.volume = this.capacity;
        } else {
            this.volume +=amount;
        }
    }
    public double getFromTank(double amount){
        if(amount > this.volume){
            this.volume = 0;
            return this.volume;
        }
        else{
            this.volume-=amount;
            return amount;
        }
    }
    
    @Override
    public String toString(){
        return Math.ceil(this.getVolume())+"/"+Math.ceil(this.getCapacity());
    } 
}
