/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author lucariel
 */
public class Both implements Criterion {

    private Criterion a;
    private Criterion b;

    public Both(Criterion a, Criterion b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean complies(String line) {
        if (a.complies(line) && b.complies(line)) {
            return true;
        }
        else{
            return false;
        }
    }

}
