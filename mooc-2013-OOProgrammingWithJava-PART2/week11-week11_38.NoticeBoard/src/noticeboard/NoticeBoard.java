package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {


    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(500, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField textAreaUp = new JTextField("");
        JLabel textAreaDown = new JLabel("");
        JButton copyButton = new JButton("Copy!");

        container.add(textAreaUp);
        container.add(copyButton);
        container.add(textAreaDown);
        
        AreaCopier copier = new AreaCopier(textAreaUp, textAreaDown);
        copyButton.addActionListener(copier);
    }
}
