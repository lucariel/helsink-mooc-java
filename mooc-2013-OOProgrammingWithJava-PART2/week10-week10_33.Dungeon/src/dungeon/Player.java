/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author lucariel
 */
public class Player extends Movable{
    private char c;
    
    public Player() {
        super(0, 0);
        this.c = '@';
    }

    public char getC() {
        return c;
    }
    
    
    
}
