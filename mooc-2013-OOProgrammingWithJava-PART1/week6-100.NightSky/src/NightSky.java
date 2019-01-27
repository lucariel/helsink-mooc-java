/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        
        String line = "";

        Random a = new Random();
        for (int i = 0; i < this.width; i++) {
            double b = a.nextDouble();
            if (this.density > b) {
                line = line + "*";
                this.starsInLastPrint++;
            } else {
                line = line + " ";
            }

        }
        System.out.println(line);

    }

    public int starsInLastPrint() {
        int a = starsInLastPrint;
        this.starsInLastPrint = 0;
        return a;
    }

    
    public void print(){
        for (int i = 0; i < height; i++) {
            this.printLine();
        }
    }
    

}
