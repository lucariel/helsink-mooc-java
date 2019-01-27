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
public class RingingCentre {

    private Map<Bird, List<String>> observations;

    public RingingCentre() {
         observations = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        List<String> places = new ArrayList<String>();
        if (!observations.keySet().contains(bird)) {
            places.add(place);
            observations.put(bird, places);

        } else {
            places = observations.get(bird);
            places.add(place);
            observations.put(bird, places);
        }
    }

    public void observations(Bird bird) {
        if (observations.get(bird) == null) {
            System.out.println(bird.toString() + " observations: " + 0);
            //System.out.println(birds.get(bird));
        } else {
            System.out.println(bird.toString() + " observations: " + observations.get(bird).size());
            System.out.println(observations.get(bird));
        }
    }

}
