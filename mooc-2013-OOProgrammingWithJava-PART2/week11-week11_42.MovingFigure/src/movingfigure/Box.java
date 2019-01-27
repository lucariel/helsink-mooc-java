/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author lucariel
 */
public class Box extends Figure{
    
    private  int hight;
    
    private  int width;

   
    public Box(int x, int y,int hight,int width) {
        super(x, y);
     
        this.width = width;
        this.hight = hight;
    }


    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(), hight, width);
    }
    
}
