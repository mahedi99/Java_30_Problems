package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Mahedi Hassan
 * 2020-04-28
 */

public class CustomInterfaceLambda {

    public static void main(String [] aa){
        List<Person> people = Arrays.asList(
                new Person("Walter", "White", 70),
                new Person("John", "Doe", 50),
                new Person("Steve", "Smith", 60)
        );

        printData(people, person -> {
            if (person.getAge() > 55){
                System.out.println(person.getFirstName() + " : " + person.getAge());
            }
        });

    }

    public static void printData(List<Person> people, Consumer<Person> consumer){ //Consumer is a Java provided Interface, Custom interface could be used as well
        for (Person person : people){
            consumer.accept(person);
        }
    }


    static class Person {
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
}
