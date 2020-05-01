package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Mahedi Hassan
 * 2020-04-30
 */

public class MethodReference {

    public static void main(String a[]){

        //Example 1
        Thread thread = new Thread(MethodReference::myPrint);
        thread.start();

        //Example 2
        secondExample(System.out::println); //passed implementation from here

        //Example 3
        List<String> list = Arrays.asList("First", "Second", "Third");
        list.forEach(System.out::println);

    }

    public static void myPrint(){
        System.out.println("First Example");
    }

    public static void secondExample(Consumer<String> consumer){ //Consumer is a java provided interface, can be used for any project
        consumer.accept("Second Example");
    }

}
