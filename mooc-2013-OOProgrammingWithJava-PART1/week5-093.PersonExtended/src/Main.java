
public class Main {

    public static void main(String[] args) {
        // write test code here
        // Person pekka = new Person("Pekka", 15, 2, 1993);
        Person Jarmo = new Person("Jarmo", new MyDate(15, 9, 1954));
        Person Petteri = new Person("Petteri", new MyDate(4, 4, 1978));
        Person steve = new Person("Steve");
        //Person (Jarmo, born 15.9.1954) should be older than (Petteri, born 4.4.1978)

        System.out.println(Jarmo.olderThan(Petteri));
        }
}
