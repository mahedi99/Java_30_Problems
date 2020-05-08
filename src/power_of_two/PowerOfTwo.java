package power_of_two;

/**
 * @author Mahedi Hassan
 * 2020-05-08
 */

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int number) {
        if (number == 0) {
            return true;
        }
        for (int i = number; i != 1; i = i / 2) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
