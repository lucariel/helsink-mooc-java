/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
public class Airplane {

    private String id;
    private int capacity;

    @Override
    public String toString() {
        return this.getId()+" ("+this.getCapacity()+" ppl)";
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}
