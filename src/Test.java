import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

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

        String s = "ihtuwvgfwvgfelssduismbujdnxjtmjkjdevhwmaiuooiwoiwugqblrbqiwcxbanmdhfivtjqlyxrtumduxreaxswtcmfhjrwemtyjhcywmockxtwikvwboqfphbrtwbunuqwmvtpayuxgvtpjcqsfgssjmtuqfctbjrlkkjpcpeabeoymxpfyugaxidvqmbcgibgsumlrllqsdvbliffdstkreaankrlmsfqfyqxxyekrsakcvrmsyksxnpajqnvotqovepcwpcllyopfdmxxjhcnymgkxqjqyljnbisvopdkttgmwslejhejbgvjwpanvumxkfkvmtlryvucdrisiibsvtioqcohgrivpxhmlgrkxwgkexdwpihhfayjobsnfsxvdhrhanllxirjitvqtwlhvmrewyphdyaylunetcbvklvlxhodnemegqjkoipdtasrgleorikhqhhkvxkinfjylaqqwmbovstlngaaltyasqutawhtnsvqosslwfvfgjxxtolphnkyvgamntawrdlwiuacqirfjliarutjygidpyjcvaifibnprgwjdirngmtjmevqntnkchcgxautanqbfcqjlsajdfbdisqtrbjjvoglvpwftnmcwohedqtvypumihgiiiujwuvuikguxuqmpkohslvorndrkqnojfaghsaydtswkexrjjjrvujrqvrsyvufrhnjsmtxljpdjhrulooydrfdvdaxrrsbmaisxxsnnmincetrmfjphqddeftimsfftmvbijmikqbirenmjlmuywmdsejxijlhbpusemntqykpijaxtoktuajqcpruhmsjqdmqdhqebeyqupinjlhwwfbmxqtqhanrtegmmmjhstxbgwwcdqblskvkinjdijemkuoqwutjfcfbvcrybdtelwdbwuvcemuaffkhmorhpxbclvnfvrpurapyxknkpswkverdccdswyeaqxqrytswsknwuenwdwaoehlltduybndpjmigyukpwv";
        System.out.println(calculate(s));

    }

    private static String calculate(String s) {
        if(s.isEmpty() || s.length() <= 3){
            return "YES";
        }

        char [] c = s.toCharArray();
        HashMap<Character, Integer> value = new HashMap<>();
        for (int i = 0; i < c.length; i++){
            if(value.containsKey(c[i])){
                int tmp = value.get(c[i]) + 1;
                value.put(c[i], tmp);
            }
            else{
                value.put(c[i], 1);
            }
        }

        ArrayList<Integer> tmp = new ArrayList<>(value.values());
        Collections.sort(tmp, Collections.reverseOrder());

        if (tmp.get(0) >= tmp.get(tmp.size() - 1)){
            if (tmp.size() > 2){
                if(tmp.get(1) == tmp.get(tmp.size() - 1)) {
                    return "YES";
                }
                else if(tmp.get(0) == tmp.get(tmp.size() - 2)){
                    return "YES";
                }
                else{ return "NO";}
            }
            return "YES";
        }
        else {
            return "NO";
        }
    }
}

//Suggestions & Bug Fixes:
