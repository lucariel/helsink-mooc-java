
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public Person(String name, int day, int montd, int year) {
        this.name = name;
        this.birthday = new MyDate(day,montd, year);
    }
    public Person(String name) {
        this.name = name;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int currentDay = Calendar.getInstance().get(Calendar.DATE);
        MyDate today = new MyDate(currentDay, currentMonth, currentYear);
        this.birthday = today;
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int currentDay = Calendar.getInstance().get(Calendar.DATE);

        MyDate today = new MyDate(currentDay, currentMonth, currentYear);

        return today.differenceInYears(birthday);
    }

    public boolean olderThan(Person compared) {
        int a = this.birthday.getYear()*365;
        int b = this.birthday.getMonth()*30;
        int c = this.birthday.getDay()+b+a;
        
        int d = compared.birthday.getYear()*365;
        int e = compared.birthday.getMonth()*30;
        int f = compared.birthday.getDay()+e+d;
        
        
        if (c<f) {
            
            return true;
        } else {
            // compare the ages based on birthdays
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
