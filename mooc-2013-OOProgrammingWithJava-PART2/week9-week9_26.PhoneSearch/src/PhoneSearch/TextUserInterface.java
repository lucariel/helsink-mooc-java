/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucariel
 */
package PhoneSearch;

import java.util.*;

public class TextUserInterface {

    private ArrayList<Person> parts;
    private Scanner a;
    private int round;

    public TextUserInterface(Scanner reader) {
        parts = new ArrayList<Person>();
        a = reader;

    }

    public boolean isPerson(String a) {
        boolean r = false;
        for (Person b : parts) {
            if (a.equals(b.getName())) {
                r = true;
            }
        }
        return r;
    }

    public Person getPerson(String a) {
        for (Person b : parts) {
            if (a.equals(b.getName())) {
                return b;
            }
        }
        throw new IllegalArgumentException("No person there");
    }

    public void start() {

        System.out.println("phone search \navailable operations:");
        System.out.println(" 1 add a number\n 2 search for a number\n 3 search for a person by phone number\n 4 add an address\n 5 search for personal information\n 6 delete personal information\n 7 filtered listing\n x quit");
        while (true) {
            System.out.println("command: ");
            String statement = a.nextLine();
            if (statement.equals("x")) {
                break;
            }
            if (statement.equals("1")) {
                System.out.println("whose number:");
                String name = a.nextLine();
                if (!isPerson(name)) {
                    Person p = new Person(name);
                    System.out.println("number:");
                    String num = a.nextLine();
                    p.addNumber(num);
                    parts.add(p);
                } else {
                    System.out.println("number:");
                    String num = a.nextLine();
                    parts.get(parts.indexOf(getPerson(name))).addNumber(num);
                }

            }
            if (statement.equals("2")) {
                System.out.println("whose number:");
                String name = a.nextLine();
                if (isPerson(name)) {
                    System.out.println(getPerson(name).getNumbers());
                } else if (!isPerson(name)) {
                    System.out.println("  not found");
                }

            }
            if (statement.equals("3")) {
                System.out.println("number:");
                String n = a.nextLine();
                boolean found = false;
                for (Person a : parts) {
                    if (a.searchByNumber(n)) {
                        found = true;
                        System.out.println(a.getName());
                    }
                }
                if (!found) {
                    System.out.println(" not found");
                }
            }
            if (statement.equals("4")) {
                System.out.println("whose address:");
                String name = a.nextLine();
                if (isPerson(name)) {
                    System.out.println("street: ");
                    String street = a.nextLine();

                    System.out.println("city: ");
                    String city = a.nextLine();

                    getPerson(name).giveAddress(street, city);
                } else if (!isPerson(name)) {
                    Person p = new Person(name);
                    System.out.println("street: ");
                    String street = a.nextLine();

                    System.out.println("city: ");
                    String city = a.nextLine();

                    p.giveAddress(street, city);
                    parts.add(p);
                }
            }
            if (statement.equals("5")) {
                System.out.println("whose information: ");
                String name = a.nextLine();
                if (isPerson(name)) {
                    getPerson(name).printInformation();
                } else if (!isPerson(name)) {
                    System.out.println("  not found");
                }
            }

            if (statement.equals("6")) {
                System.out.println("whose information: ");
                String name = a.nextLine();
                if (isPerson(name)) {
                    parts.remove(getPerson(name));
                } else if (!isPerson(name)) {
                    System.out.println("  not found");
                }
            }

        }
    }

}
