package reverse_text;

import java.util.Scanner;

/**
 * @author Mahedi Hassan
 * 2020-03-31
 */

public class ReverseText {
    private static Scanner scanner;

    public static void main(String a[]) {
        scanner = new Scanner(System.in);
        System.out.println(new ReverseText().reverseText(scanner.nextLine()));
    }

    public String reverseText(String input) {
        if (input == null || input == "") {
            return "";
        }
        char[] array = input.toCharArray();
        int halfLength = array.length / 2;
        char temp;
        for (int i = 0; i < halfLength; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }

        return String.valueOf(array);
    }
}
