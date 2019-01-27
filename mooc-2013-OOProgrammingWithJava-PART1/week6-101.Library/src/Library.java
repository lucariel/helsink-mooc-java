/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
import java.util.*;
import java.lang.*;

public class Library {

    private ArrayList<Book> books = new ArrayList<Book>();

    public Library() {
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book a : books) {
            System.out.println(a.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book a : books) {
            /*if(a.title().contains(title)){
                found.add(a);
            }*/

            if (StringUtils.included(a.title(), title)) {
                // Book found!
                found.add(a);
            }

        }

        return found;

    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book a : books) {
            if (StringUtils.included(a.publisher(), publisher)) {
                found.add(a);
            }
        }
        

        return found;

    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book a : books) {
            if (a.year() == year) {
                found.add(a);
            }
        }

        return found;

    }

    

}
