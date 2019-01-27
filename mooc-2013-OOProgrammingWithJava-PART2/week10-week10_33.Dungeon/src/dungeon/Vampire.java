/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.*;

/**
 *
 * @author lucariel
 */
public class Vampire extends Movable{
    private char c;
    
    public Vampire(Board b) {
        super(b);
        this.c = 'v';
    }

    public char getC() {
        return c;
    }
   
    
}
