/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author lucariel
 */
public class birdWatcher {

    private ArrayList<Bird> a = new ArrayList<Bird>();
    private ArrayList<Integer> observation = new ArrayList<Integer>();

    public void add(Bird bird) {
        if (!a.contains(bird)) {
            a.add(bird);
            observation.add(0);
        }
    }

    public Bird searchBird(String name) {
        Bird notFound = new Bird("NotFound", "notFound");
        for (Bird b : a) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return notFound;
    }

    public boolean isBird(String bird) {
        boolean rta = false;
        for (Bird b : a) {
            if (b.getName().equalsIgnoreCase(bird)) {
                rta = true;
            }
        }

        return rta;

    }

    public void observ(Bird bird) {
        if (a.contains(bird)) {
            observation.set(a.indexOf(bird), observation.get(a.indexOf(bird)) + 1);
        } else {
            System.out.println("Is not a bird!");
        }

    }

    public void staticstics() {
        for (Bird b : a) {
            System.out.println(b.getName() + "(" + b.getLatinName() + "): " + observation.get(a.indexOf(b)));
        }

    }

    public void show(Bird b) {
        System.out.println(b.getName() + "(" + b.getLatinName() + "): " + observation.get(a.indexOf(b)));

    }

}
