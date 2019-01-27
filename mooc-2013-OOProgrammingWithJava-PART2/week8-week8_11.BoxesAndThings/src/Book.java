/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
public class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weigth;

    public Book(String writer, String name, double weigth) {
        this.writer = writer;
        this.name = name;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return this.writer+": "+this.name;
    }

    @Override
    public double weight() {
        return this.weigth;
    }
    
    
}
