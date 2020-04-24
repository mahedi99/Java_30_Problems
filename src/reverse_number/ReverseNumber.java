package reverse_number;

/**
 * @author Mahedi Hassan
 * 2020-04-24
 */

public class ReverseNumber {
     public int reverseNumber(int number){
         int reverse = 0;
         while (number != 0){
             int digit = number % 10;
             reverse = reverse * 10 + digit;
             number /= 10;
         }
         return reverse;
     }
}
