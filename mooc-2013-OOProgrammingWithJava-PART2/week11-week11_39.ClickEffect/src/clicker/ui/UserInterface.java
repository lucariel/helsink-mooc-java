package clicker.ui;

import clicker.applicationlogic.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Calculator c;

    public UserInterface(Calculator c) {
        this.c = c;
    }

    

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        JLabel text = new JLabel(this.c.giveValue()+"");
        
        JButton button = new JButton("Click!");
        
        
        ClickListener listener = new ClickListener(this.c,text);
        button.addActionListener(listener);
        
        
        container.add(text, BorderLayout.NORTH);
        container.add(button, BorderLayout.SOUTH);
        

        
        
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
