package delete_node_linklist;

import java.util.StringJoiner;

/**
 * @author Mahedi Hassan
 * 2020-05-04
 */

public class LinkedList<T> {
    private Node head;
    public void add(T value){
        Node node = new Node(value, null);
        if (this.head == null){
            this.head = node;
        }
        else {
            Node last = this.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }

    public boolean remove(T value) {
        Node node = head;
        Node prev = null;
        while (node != null) {
            if (node.value.equals(value)) {
                if (prev == null) {
                    this.head = node.next;
                } else {
                    prev.next = node.next;
                }
                return true;
            }
            prev = node;
            node = node.next;
        }
        return false;
    }

    @Override
    public String toString() {
        Node node = head;
        StringJoiner joiner = new StringJoiner(",");
        while (node != null){
            joiner.add(node.value.toString());
            node = node.next;
        }
        return joiner.toString().trim();
    }
}
