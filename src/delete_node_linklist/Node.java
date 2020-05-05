package delete_node_linklist;

/**
 * @author Mahedi Hassan
 * 2020-05-04
 */

public class Node<T> {
    Node next;
    T value;
    public Node(T value, Node next){
        this.value = value;
        this.next = next;
    }
}
