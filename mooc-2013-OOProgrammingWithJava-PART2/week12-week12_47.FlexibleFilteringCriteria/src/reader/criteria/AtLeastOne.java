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
public class AtLeastOne implements Criterion {

    private Criterion[] criteria;

    public AtLeastOne(Criterion... a) {

        this.criteria = a;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion b : criteria) {
            if (b.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
