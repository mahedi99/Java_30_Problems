package java_8;

/**
 * @author Mahedi Hassan
 * 2020-04-28
 */

public class TypeInferenceExample {


    public static void main(String[] aa){
        StringLengthLambda lambda = s -> s.length();
        System.out.println(lambda.getLength("hi"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}
