package drawing.ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import drawing.ui.Avatar;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Component;

/**
 *
 * @author lucariel
 */
public class KeyboardListener implements KeyListener {

    private Component component;
    private Avatar avatar;

    public KeyboardListener(Avatar avatar, Component component) {
        this.avatar = avatar;
        this.component = component;

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Keystroke " + e.getKeyCode() + " pressed.");
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            avatar.move(-5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            avatar.move(5, 0);
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}
