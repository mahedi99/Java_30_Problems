package most_significant_bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MSBTest {

    @Test
    public void calculateMSBTest(){
        MSB msb = new MSB();
        assertEquals(0, msb.calculateMostSignificantBit(0));
        assertEquals(0, msb.calculateMostSignificantBit(-1));
        assertEquals(8, msb.calculateMostSignificantBit(10));
        assertEquals(2, msb.calculateMostSignificantBit(2));
    }

}