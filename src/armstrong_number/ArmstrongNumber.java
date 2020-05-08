package armstrong_number;

/**
 * @author Mahedi Hassan
 * 2020-05-08
 */

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int number){
        if (number < 0){
            return false;
        }
        int sum = 0;
        char[] numbers = String.valueOf(number).toCharArray();
        int length = numbers.length;
        for (int i = 0; i < numbers.length; i++){
            sum += Math.pow(Character.getNumericValue(numbers[i]), length);
        }
        return (sum == number);
    }
}
