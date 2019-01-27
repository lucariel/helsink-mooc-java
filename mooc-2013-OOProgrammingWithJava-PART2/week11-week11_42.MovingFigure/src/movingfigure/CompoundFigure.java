/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author lucariel
 */
public class CompoundFigure extends Figure {
    private ArrayList<Figure> parts;

    public CompoundFigure() {
        
        parts = new ArrayList<Figure>();
    }
    
    public void add(Figure f){
        parts.add(f);
    }
    
    
    @Override
    public void draw(Graphics graphics) {
        for(Figure f : parts){
            f.draw(graphics);
        }

    }
    @Override
    public void move(int x, int y){
    for(Figure f : parts){
            f.move(x, y);
        }
    }
    
}
