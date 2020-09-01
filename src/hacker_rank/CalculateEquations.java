package hacker_rank;

import java.util.*;

/**
 * @author Mahedi Hassan
 * 2020-06-24
 */

public class CalculateEquations {

    static HashMap<String, Integer> variables = new HashMap<>();
    public static void main(String arr[]){
        String equations = "y = x + 1\n" +
                "5 = x + 3\n" +
                "10 = z + y + 2";
        calculate(equations);
    }

    private static void calculate(String s) {
        ArrayList<String> equations = new ArrayList<>(Arrays.asList(s.trim().split("\n")));
        //find variables
        for (int i = 0; i < equations.size(); i++){
            String[] c = equations.get(i).split(" ");
            for (int j = 0; j < c.length; j++){
                if (isWord(c[j])){
                    variables.put(c[j], Integer.MIN_VALUE);
                }
            }
        }

        for (int i = 0; i < equations.size(); i++){
            ArrayList<String> c = new ArrayList<>(Arrays.asList(equations.get(i).split(" ")));
            int totalVariable  = 0;
            String variable = "";
            for (int j = 0; j < c.size(); j++){
                if (isWord(c.get(j))){
                    int val = variables.get(c.get(j));
                    if (val == Integer.MIN_VALUE && !(totalVariable > 1)){
                        totalVariable++;
                        variable = c.get(j);
                    }
                    else if (totalVariable > 1){
                        continue;
                    }
                }
            }
            if (totalVariable == 1 && variable != null){
                findValue(equations.get(i), variable);
                equations.remove(i);
                i = -1;
            }
        }
    }

    public static void findValue(String s, String variable){
        int leftSide = 0;
        int rightSide = 0;

        String left = s.substring(0, s.indexOf("=")).trim();
        String right = s.substring(s.indexOf("=") + 1).trim();
        boolean isOperatorLeft = left.contains(variable);

        leftSide = calculateEachSide(left);
        rightSide = calculateEachSide(right);

        int result = isOperatorLeft ? (rightSide - leftSide) : (leftSide - rightSide);
        variables.put(variable, result);
        System.out.println(variable + " : " + result);
    }

    public static int calculateEachSide(String s){
        int total = 0;
        String rightArr[] = s.split(" ");
        for (String arr: rightArr) {
            if (arr.matches("^\\d+$")){
                total += Integer.parseInt(arr);
            }
            else if (isWord(arr) && variables.get(arr) > Integer.MIN_VALUE){
                total += variables.get(arr);
            }
        }
        return total;
    }

    private static boolean isWord(String c){
        HashSet<String> s = new HashSet<>();

        return  (!c.matches("^\\d+$")
                && !c.equals("=")
                && !c.equals("+")
                && !c.equals("-")
                && !c.equals("*")
                && !c.equals("//"));


    }
}
