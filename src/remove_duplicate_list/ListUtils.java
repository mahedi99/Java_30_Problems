package remove_duplicate_list;

import java.util.*;

/**
 * @author Mahedi Hassan
 * 2020-05-04
 */

public class ListUtils<E> {
    public List<E> removeDuplicateFromList(List<E> list){
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
