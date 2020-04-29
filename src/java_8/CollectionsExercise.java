package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mahedi Hassan
 * 2020-04-28
 */

public class CollectionsExercise {

    public static void main(String s[]){
        List<Person> people = Arrays.asList(
                new Person("Walter", "White", 70),
                new Person("John", "Doe", 50),
                new Person("Steve", "Smith", 60)
        );

        Collections.sort(people, (o1, o2) -> o1.getAge() > o2.getAge() ? 1 : -1);
        people.forEach(person -> System.out.println(person.getFirstName()));
    }

}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
