package reserse_linklist;

/**
 * @author Mahedi Hassan
 * 2020-04-15
 */

public class Node<T> {
    final T data;
    Node next;
    Node(T data, Node next){
        this.next = next;
        this.data = data;
    }
}
