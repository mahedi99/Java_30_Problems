import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Mahedi Hassan
 * 2020-04-22
 */

public class Test {
    //System.out.println();

    Scanner scanner = new Scanner(System.in);
    public static void main(String a[]){
        Map<String, Integer> aa = new HashMap<>();
           aa.put("a", 0x01 << 3);
           int x [] = {1};
//           int i = 1234567890123;
//           System.out.println("a".compareTo("b") + a.s);
//        if ("".getClass().getSimpleName() ==  "String"){
            Supplier<String> runnable = String::new;
            System.out.println(runnable.get());
//        }
    }
}