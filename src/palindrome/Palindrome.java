package palindrome;

import java.util.Scanner;

/**
 * @author Mahedi Hassan
 * 2020-03-30
 */

public class Palindrome {

    private static Scanner scanner;

    public static void main(String[] a){
        scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(calculatePalindrome(s));
    }

    private static boolean calculatePalindrome(String input) {
        int j = input.length() - 1;
        for (int i = 0; i < j; i++){
            if (input.charAt(i) != input.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
