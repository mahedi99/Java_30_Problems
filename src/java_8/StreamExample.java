package java_8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Mahedi Hassan
 * 2020-04-30
 */

public class StreamExample {

    public static void main(String [] a){

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10000; i++){
            people.add(new Person("Walter" + i, "White" + i, i));
        }

        //Without Stream
        long before = new Date().getTime();
        List<Person> list = new ArrayList<>();
        for (Person person : people){
            if (person != null && person.getAge() > 50){
                list.add(person);
            }
        }
//        list.forEach(p -> System.out.println(p.getFirstName()));
        System.out.println("Without Stream \nTime took : " + (new Date().getTime() - before));


        //With Stream
        long b = new Date().getTime();
        List<Person> x = people.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > 50)
                .collect(Collectors.toList());
//                .forEach( p -> System.out.println(p.getFirstName()));
//        x.forEach(p -> System.out.println(p.getFirstName()));
        System.out.println("With Stream \nTime took : " + (new Date().getTime() - b));
    }

}
