/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.*;
import reference.domain.*;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author lucariel
 */
public class RatingRegister {

    private Map<Film, List<Rating>> listRating;
    private Map<Person, Map<Film, Rating>> listPerson;

    public RatingRegister() {
        this.listRating = new HashMap<Film, List<Rating>>();
        this.listPerson = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!listRating.containsKey(film)) {
            listRating.put(film, new ArrayList<Rating>());
            listRating.get(film).add(rating);
        } else {
            listRating.get(film).add(rating);
        }

    }

    public Rating getRating(Person person, Film film) {
        if (listPerson.get(person).containsKey(film)) {
            return listPerson.get(person).get(film);
        } else {
            return Rating.NOT_WATCHED;
        }
    }

    public void addRating(Person person, Film film, Rating rating) {
        this.addRating(film, rating);
        if (!listPerson.containsKey(person)) {
            listPerson.put(person, new HashMap<Film, Rating>());
            listPerson.get(person).put(film, rating);
        } else {
            listPerson.get(person).put(film, rating);

        }

    }

    public List<Rating> getRatings(Film film) {
        List<Rating> a = new ArrayList<Rating>();

        for (Film key : listRating.keySet()) {
            if (film.equals(key)) {
                for (Rating r : listRating.get(key)) {
                    a.add(r);
                }
            }
        }

        return a;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (listPerson.containsKey(person)) {
            return listPerson.get(person);
        }
        else{
            return new HashMap();
        }
        
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.listRating;
    }

    public List<Person> reviewers() {
        List<Person> pe = new ArrayList<Person>();
        for (Person p : listPerson.keySet()) {
            pe.add(p);
        }
        return pe;
    }

}
