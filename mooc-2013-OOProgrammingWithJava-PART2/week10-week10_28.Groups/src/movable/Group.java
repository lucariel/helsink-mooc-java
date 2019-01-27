package movable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author lucariel
 */
public class Group implements Movable{
    private ArrayList<Movable> movables;

    public Group() {
        this.movables = new ArrayList<Movable>();
    }
    @Override
    public String toString(){
        String str ="";
        for(Movable a : movables){
            str+=a.toString()+"\n";
        }
        return str;
    }
    
    public void addToGroup(Movable movable){
        movables.add(movable);
    }
    @Override
    public void move(int dx, int dy) {
        for(Movable a : movables){
            a.move(dx, dy);
        }
    }
    
    
    
}
