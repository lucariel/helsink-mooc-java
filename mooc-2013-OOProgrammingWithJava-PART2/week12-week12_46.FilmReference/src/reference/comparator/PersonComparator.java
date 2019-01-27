/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.*;
import reference.domain.Person;

/**
 *
 * @author lucariel
 */
public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;

    }

    @Override
    public int compare(Person t, Person t1) {
        if (peopleIdentities.get(t) == peopleIdentities.get(t1)) {
            return 0;
        } else if (peopleIdentities.get(t) > peopleIdentities.get(t1)) {
            return -1;
        } else {
            return 1;
        }
    }

}
