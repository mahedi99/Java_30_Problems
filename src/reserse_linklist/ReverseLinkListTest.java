package reserse_linklist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mahedi Hassan
 * 2020-04-15
 */

class ReverseLinkListTest {


    @Test
    public void addTest(){
        ReverseLinkList<String> reverseLinkList = new ReverseLinkList<>();
        assertEquals("[]", reverseLinkList.toString());
        reverseLinkList.add("1");
        reverseLinkList.add("2");
        reverseLinkList.add("3");
        assertEquals("[1 -> 2 -> 3]", reverseLinkList.toString());
    }

    @Test
    public void reverseTest(){
        ReverseLinkList<String> reverseLinkList = new ReverseLinkList<>();
        reverseLinkList.add("1");
        reverseLinkList.add("2");
        reverseLinkList.add("3");
        reverseLinkList.reverse();
        assertEquals("[3 -> 2 -> 1]", reverseLinkList.toString());
    }

}