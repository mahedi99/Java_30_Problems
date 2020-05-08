package power_of_two;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 4, 16})
    public void isPowerOfTwoTest(int numbers){
        assertTrue(PowerOfTwo.isPowerOfTwo(numbers));
    }

}