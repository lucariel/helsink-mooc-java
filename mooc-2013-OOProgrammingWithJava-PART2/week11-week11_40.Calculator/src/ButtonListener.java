/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lucariel
 */
public class ButtonListener implements ActionListener {

    private JButton button;
    private Calculator calculator;
    private JTextField text;
    private JTextField input;

    public ButtonListener() {
    }

    public ButtonListener(Calculator c, JButton button, JTextField text, JTextField input) {
        this.button = button;
        this.calculator = c;
        this.text = text;
        this.input = input;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (button.getText().equals("+")) {
            try {
                int str = Integer.parseInt(input.getText());
                this.calculator.increase(str);
                this.text.setText(this.calculator.giveValue() + "");
                this.input.setText("");
            } catch (Exception e) {
                this.input.setText("");

            }

        } else if (button.getText().equals("-")) {
            try {
                int str = Integer.parseInt(input.getText());
                this.calculator.decrease(str);
                this.text.setText(this.calculator.giveValue() + "");
                this.input.setText("");
            } catch (Exception e) {
                this.input.setText("");

            }

        } else if (button.getText().equals("Z")) {
            this.calculator.reset();
            button.setEnabled(false);
            this.text.setText(this.calculator.giveValue() + "");
        }

    }

}
