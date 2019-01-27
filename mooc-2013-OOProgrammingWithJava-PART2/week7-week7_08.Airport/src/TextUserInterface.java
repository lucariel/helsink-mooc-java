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

public class TextUserInterface {

    private Scanner a;
    ArrayList<Flight> flights = new ArrayList<Flight>();
    ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
    Airplane plane;

    public TextUserInterface(Scanner reader) {

        a = reader;

    }

    public Airplane searchPlane(String name) {

        for (Airplane a : airplanes) {
            if (name.equals(a.getId())) {
                return a;
            }
        }
        return null;
        
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String statement = a.nextLine();

            if (statement.equals("x")) {
                break;
            } else if (statement.equals("1")) {
                System.out.println("Give plane ID:");
                String planeID = a.nextLine();

                System.out.println("Give plane capacity:");
                int capacity = Integer.parseInt(a.nextLine());

                Airplane plane = new Airplane(planeID, capacity);
                airplanes.add(plane);
                

            } else if (statement.equals("2")) {

                System.out.println("Give plane ID: ");
                String planeID = a.nextLine();
                plane = searchPlane(planeID);
                System.out.println(plane.toString());

                System.out.println("Give departure airport code: ");
                String DepAirportCode = a.nextLine();

                System.out.println("Give destination airport code: ");
                String DesAirportCode = a.nextLine();;

                Flight flight = new Flight(plane, DepAirportCode, DesAirportCode);
                flights.add(flight);
            }
        }

        System.out.println("Flight service");
        System.out.println("------------");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String statement = a.nextLine();

            if (statement.equals("x")) {
                break;
            } else if (statement.equals("1")) {
                for (Airplane air : airplanes) {
                    System.out.println(air.toString());
                }

            } else if (statement.equals("2")) {
                for (Flight fl : flights) {
                    System.out.println(fl.toString());
                }

            } else if (statement.equals("3")){
                System.out.println("Give plane ID:");
                String planeID = a.nextLine();
                System.out.println(searchPlane(planeID).toString());
            }
        }

    }

}
