/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author lucariel
 */
public class Movable {

    private char c;
    private int x;

    public char getC() {
        return c;
    }
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    private Random originalPosition;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Movable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Movable(Board b) {
        originalPosition = new Random();
        int x = originalPosition.nextInt(b.getLength());
        int y = originalPosition.nextInt(b.getHeight());
        while (x == 0 & y == 0) {
             x = originalPosition.nextInt(b.getLength());
             y = originalPosition.nextInt(b.getHeight());
        }
        this.x = x;
        this.y = y;
    }

    public void move(String s) {
        if (s.equals("d")) {
            this.y += 1;
        } else if (s.equals("a")) {
            this.y -= 1;
        } else if (s.equals("s")) {
            this.x += 1;
        } else if (s.equals("w")) {
            this.x -= 1;
        }

    }

}
