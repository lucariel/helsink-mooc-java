/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author lucariel
 */
public class KeyboardListener implements KeyListener {

    private Component component;
    private Figure figure;

    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Keystroke " + e.getKeyCode() + " pressed.");

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-50, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(50, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0, -50);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 50);
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
