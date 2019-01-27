/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.*;
import reference.RatingRegister;
import reference.*;
import reference.domain.Film;

import reference.domain.Person;
import reference.comparator.*;
import reference.domain.Rating;

/**
 *
 * @author lucariel
 */
public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {

        List<Film> films = new ArrayList<Film>(ratingRegister.filmRatings().keySet());
        Collections.sort(films, new FilmComparator(ratingRegister.filmRatings()));
        if (films.size() == ratingRegister.getPersonalRatings(person).size()) {
            return null;
        } else {
            int i = 0;
            
            while(ratingRegister.getPersonalRatings(person).containsKey(films.get(i))){
                i++;
            }
            return films.get(i);
        }

    }
}
