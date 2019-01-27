
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        System.out.println("Grade distribution:");
        // do not put all to one method/class but rather design a proper 
        //structure to your program
        ArrayList<Integer> grades = new ArrayList<Integer>();
        ArrayList<Integer> points = new ArrayList<Integer>();
        GradesAndPoints map = new GradesAndPoints();

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass 
        //it as parameter
        while (true) {
            int grade = lukija.nextInt();

            if (grade == -1) {
                for (int a : grades) {
                    points.add(map.grader(a));
                }
                map.stars(points);
                System.out.println("5:" + map.getCinco());
                System.out.println("4:" + map.getCuatro());
                System.out.println("3:" + map.getTres());
                System.out.println("2:" + map.getDos());
                System.out.println("1:" + map.getUno());
                System.out.println("0:" + map.getCero());
                System.out.println("Acceptance percentage: "+Math.round(map.acceptanceRate(points)*10.0)/10.0);
                break;
            } else if (grade >= 0 & grade <= 60) {
                grades.add(grade);

            }

        }

    }
}
