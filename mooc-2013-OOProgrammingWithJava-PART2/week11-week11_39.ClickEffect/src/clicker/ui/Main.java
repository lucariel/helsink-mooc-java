package clicker.ui;

import clicker.applicationlogic.*;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        PersonalCalculator c = new PersonalCalculator();
        UserInterface ui = new UserInterface( c);
        SwingUtilities.invokeLater(ui);
       
    }
}
