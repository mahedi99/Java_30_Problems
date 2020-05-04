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
        ListUtils listUtils = new ListUtils();

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertEquals(list, listUtils.removeDuplicateFromList(list));

        list.add("a");
        assertNotEquals(list, listUtils.removeDuplicateFromList(list));
    }

}