package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void pushPop(){
        Stack stack = new Stack(3);
//        assertTrue(stack.getSize()== 0);
        stack.push(10);
//        assertEquals(1, stack.getSize());
        stack.push(20);
        assertEquals(20, stack.peek());
//        stack.pop();
        stack.push(30);
        assertTrue(stack.isFull());
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
        stack.push(50);
        assertEquals(50, stack.peek());
    }

}