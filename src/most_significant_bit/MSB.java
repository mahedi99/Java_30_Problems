package most_significant_bit;

/**
 * @author Mahedi Hassan
 * 2020-05-29
 */

public class MSB {
    public int calculateMostSignificantBit(int input){
        if (input <= 0) {
            return 0;
        }
        int count = 0;
        while (input != 1){
            input /= 2;
            count++;
        }
        return 1 << count; // shifting the binary value COUNT times, if count is 2; 1 will be shifted left side twice. Ex. 1 -> 100
    }
}
