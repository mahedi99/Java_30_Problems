package delete_node_linklist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListDeleteTest {

    static LinkedList<String> linkedList;

    @BeforeAll
    public static void beforeTest(){
        linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
    }

    @Test
    public void removeTest(){
        boolean remove = linkedList.remove("b");
        assertTrue(remove);
        assertEquals("a,c", linkedList.toString());
    }
}