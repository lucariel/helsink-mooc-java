
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    
    private JTextField input;
    private JTextField output;
    private JButton z;
    
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        output = new JTextField("0");
        output.setEnabled(false); 
        
        input = new JTextField();
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        z = new JButton("Z");
        
        z.setEnabled(false);
        

        plus.addActionListener(new CalculatorPlus(this.input, this.output, this.z));
        minus.addActionListener(new CalculatorMinus(this.input, this.output, this.z));
        z.addActionListener(new CalculatorZ(this.input, this.output, this.z));
        
        panel.add(plus);
        panel.add(minus);
        panel.add(z);
        
        
        container.add(output);
        container.add(input);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}






/* This works as requested but the system doesnt take it
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private Calculator c;
    private String outputText;

    private JTextField output;
    private JTextField input;

    public GraphicCalculator() {
        this.c = new Calculator();
        this.outputText = "0";
        output = new JTextField();
        input = new JTextField();
    }

    @Override

    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);

        this.output.setText(outputText);
        this.output.setEnabled(false);

        JPanel panel = createPanel();

        container.add(this.output);
        container.add(this.input);
        container.add(panel);

    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton sum = new JButton("+");
        JButton minus = new JButton("-");
        JButton Z = new JButton("Z");

        ButtonListener listenerSum = new ButtonListener(this.c, sum, this.output, this.input);
        sum.addActionListener(listenerSum);

        ButtonListener listenerMinus = new ButtonListener(this.c, minus, this.output, this.input);
        minus.addActionListener(listenerMinus);

        ButtonListener listenerZ = new ButtonListener(this.c, Z, this.output, this.input);
        Z.addActionListener(listenerZ);
        
        

        panel.add(sum);
        panel.add(minus);
        panel.add(Z);

        return panel;
    }

}
*/