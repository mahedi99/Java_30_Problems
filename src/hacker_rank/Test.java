package hacker_rank;

/**
 * @author Mahedi Hassan
 * 2020-06-27
 */


import java.io.*;
import java.util.*;

public class Test {

    static long countingValleys(int [][] arr) {
        int rowLen = arr.length - 2;
        int colLen = arr[0].length - 2;
        Set<Integer> output = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < rowLen; i++){

            for (int j = 0; j < arr[i].length - 2; j++){
                int tempRow1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                int tempRow2 = arr[i+1][j+1];
                int tempRow3 = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                output.add(tempRow1 + tempRow2 + tempRow3);
            }

        }
        return output.iterator().next();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countingValleys(new int [][] {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}}));
        List<String> a = new LinkedList<>();
        a.add("hi");
        a.add(0, "hello");
        a.add(0, "0");
        a.forEach(System.out::println);
        System.out.println(a);
    }

}