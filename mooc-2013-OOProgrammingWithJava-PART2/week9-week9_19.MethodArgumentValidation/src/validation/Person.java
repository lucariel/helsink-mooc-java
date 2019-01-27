package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name == "" || name.length() > 40) {
            throw new IllegalArgumentException("Name not validated");
        } else {
            this.name = name;
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age not validated");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
