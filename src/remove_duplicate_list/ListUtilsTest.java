package remove_duplicate_list;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListUtilsTest {

    @Test
    public void removeDuplicateFromListTest(){

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertEquals(list, ListUtils.removeDuplicateFromList(list));

        list.add("a");
        assertNotEquals(list, ListUtils.removeDuplicateFromList(list));

        assertTrue(list.size() == 4);
        list = ListUtils.removeDuplicateFromList(list);
        assertTrue("a".equals(list.get(0)));
        assertTrue("b".equals(list.get(1)));
        assertTrue("c".equals(list.get(2)));
        assertFalse(list.size() == 4);

    }

}