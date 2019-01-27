/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author lucariel
 */
public class Phonebook {

    private ArrayList<Person> Phonebook = new ArrayList<Person>();

    public void printAll() {
        for (Person a : Phonebook) {
            System.out.println(a.toString());
        }
    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        Phonebook.add(person);
    }

    public String searchNumber(String name) {
        String number="number not known";

        for (Person a : Phonebook) {
            if (a.getName().equals(name)) {
                number = a.getNumber();
            }
        }
        return number;
    }
}
