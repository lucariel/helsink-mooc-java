/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import static java.lang.Math.*;
import java.util.*;

/**
 *
 * @author lucariel
 */
public class ContainerHistory {

    private ArrayList<Double> history;

    public ContainerHistory() {
        history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        double m = this.history.get(0);
        for (double a : this.history) {
            if (a > m) {
                m = a;
            }
        }
        return m;
    }

    public double minValue() {
        double m = this.history.get(0);
        for (double a : this.history) {
            if (a < m) {
                m = a;
            }
        }
        return m;
    }

    public double average() {
        double sum = 0;
        for (double a : this.history) {
            sum += a;
        }
        return sum / this.history.size();
    }

    public double greatestFluctuation() {
        if (this.history.size() <=1) {
            return 0;
        }
        System.out.println("prueba1");

        double fluc = 0;
        for (int i = 1; i < this.history.size(); i++) {
            double c = this.history.get(i);
            double p = this.history.get(i-1);
            double f = c-p;
            
            if(abs(f)>abs(fluc)){
                fluc = f;
            }
            
        }
        return abs(fluc);

    }
    public double variance() {
        double avg = this.average();
        double variance = 0;
        for (double a : this.history){
            variance += Math.pow(a-avg, 2);
        }
        return variance/(this.history.size()-1);
        
    }
    

}
