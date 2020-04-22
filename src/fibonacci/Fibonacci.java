package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String a[]){
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i <= number; i++){
            System.out.print(fibonacci(i) + ", ");
        }
    }
}
