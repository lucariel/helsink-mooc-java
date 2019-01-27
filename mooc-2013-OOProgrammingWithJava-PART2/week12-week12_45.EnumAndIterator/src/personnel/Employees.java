/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.*;

/**
 *
 * @author lucariel
 */
public class Employees {

    private List<Person> l;

    public Employees() {
        l = new ArrayList<Person>();
    }

    public void add(Person person) {
        l.add(person);
    }

    public void add(List<Person> persons) {
        for (Person p : persons) {
            l.add(p);
        }
    }

    public void print() {
        Iterator<Person> iterator = l.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }

    public void print(Education education) {
        Iterator<Person> iterator = l.iterator();
        while (iterator.hasNext()) {
            Person n = iterator.next();
            if (n.getEducation() == education) {
                System.out.println(n);
            }
        }

    }
    public void fire(Education education){
        Iterator<Person> iterator = l.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
