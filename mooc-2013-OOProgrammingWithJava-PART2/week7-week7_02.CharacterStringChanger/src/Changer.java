
import java.util.ArrayList;

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

public class Changer {

    ArrayList<Change> changes = new ArrayList<Change>();

    void addChange(Change change) {
        changes.add(change);
    }

    public Changer() {
    }

    public String change(String characterString) {
        String f = characterString;

        for (int i = 0; i < changes.size(); i++) {
            f = changes.get(i).change(f);
        }
        return f;
    }
}
