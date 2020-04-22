package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void pushPop(){
        Stack stack = new Stack(3);
        assertTrue(stack.getSize()== 0);
        stack.push(10);
        assertEquals(1, stack.getSize());
        stack.push(20);
        assertEquals(20, stack.peek());
    }
}