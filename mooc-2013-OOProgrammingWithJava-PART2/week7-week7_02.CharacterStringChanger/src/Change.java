/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
import java.util.ArrayList;

public class Change {

    private char a;
    private char b;
    

    public Change(char fromCharacter, char toCharacter) {
        this.a = fromCharacter;
        this.b = toCharacter;
    }

    public char getA() {
        return a;
    }

    public char getB() {
        return b;
    }

    public String change(String characterString) {
        return characterString.replace(this.a, this.b);
        
    }

    

}
