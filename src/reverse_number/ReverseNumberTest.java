package reverse_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    @Test
    public void reverseNumberTest(){
        ReverseNumber reverseNumber = new ReverseNumber();
        assertEquals(0, reverseNumber.reverseNumber(0));
        assertEquals(1463847412, reverseNumber.reverseNumber(Integer.MAX_VALUE - 6));
        assertEquals(4321, reverseNumber.reverseNumber(1234));
        assertEquals(555, reverseNumber.reverseNumber(555));
    }

}