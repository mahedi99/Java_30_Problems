import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Mahedi Hassan
 * 2020-04-22
 */

public class Test {
    //System.out.println();
    static int a = 5;
    static {
        a = 10;
        System.out.println(80 + ", " + a);
    }

    Scanner scanner = new Scanner(System.in);
    public static void main(String a[]){
        Map<String, Integer> aa = new HashMap<>();
        aa.put("a", 0x01 << 3);




           byte x = 10 << 3;
           System.out.println(aa.get("a"));
//           int i = 1234567890123;
//           System.out.println("a".compareTo("b") + a.s);
//        if ("".getClass().getSimpleName() ==  "String"){
            Supplier<String> runnable = String::new;
            System.out.println(runnable.get());
//        }

        
    }
}

//Suggestions & Bug Fixes:
