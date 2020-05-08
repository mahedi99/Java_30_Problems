package armstrong_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumberTest {

    @Test
    public void isArmStrongNumberTest(){
        assertEquals(true, ArmstrongNumber.isArmstrongNumber(0));
        assertTrue(ArmstrongNumber.isArmstrongNumber(407));
        assertTrue(ArmstrongNumber.isArmstrongNumber(9474));
        assertFalse(ArmstrongNumber.isArmstrongNumber(372));
    }

}