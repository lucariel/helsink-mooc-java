/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lucariel
 */
public class ClickListener implements ActionListener {

    private JLabel text;
    private Calculator calculator;

    public ClickListener(Calculator c,JLabel t) {
        this.text = t;
        this.calculator = c;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        this.calculator.increase();
        this.text.setText(calculator.giveValue()+"");
    }

}
