
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }

            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            if (studentNumber.equals("")) {
                break;
            }

            Student a = new Student(name, studentNumber);
            list.add(a);
        }
        for (Student a : list) {
            System.out.println(a);
        }

        System.out.println("Given search term: ");
        String term = reader.nextLine();
        ArrayList<Student> searched = new ArrayList<Student>();

        for (Student a : list) {
            if(a.getName().contains(term)){
                searched.add(a);
            }
        }
        System.out.println("result: ");
        for(Student a : searched){
            System.out.println(a);
        }
    }

}
