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
public class Cow implements Milkable, Alive {

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    private String name;
    private Random generator = new Random();
    private double capacity;
    private double milk;

    public Cow() {
        int indexOfName = generator.nextInt(31);
        this.name = NAMES[indexOfName];

        this.capacity = 15 + generator.nextInt(26);
        this.milk = 0;

    }

    public Cow(String name) {
        this.name = name;
        
        this.capacity = 15 + generator.nextInt(26);
        this.milk = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return this.milk;
    }

    @Override
    public double milk() {
        double milkTaken = this.milk;
        this.milk = 0;
        return milkTaken;
    }

    public void liveHour() {
        this.milk += (7 + generator.nextInt(20 - 7 + 1)) / 10.0;
        if (this.milk > this.capacity) {
            this.milk = this.capacity;
        }
    }
    
    
    public String toString() {
        return this.name + " " + Math.ceil(this.milk) + "/" + Math.ceil(this.capacity);
}

}
