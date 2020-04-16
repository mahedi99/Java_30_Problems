package reserse_linklist;

import java.util.StringJoiner;

/**
 * @author Mahedi Hassan
 * 2020-04-12
 */

public class ReverseLinkList<T> {
    private Node head;

    public void add(T data){
        Node node = new Node(data, null);
        if (head == null){
            head = node;
        }
        else {
            Node last = this.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }

    public void reverse(){
        if (head != null) {
            Node tmp = head;
            Node swap;
            while (tmp.next != null) {
                swap = tmp.next;  //2
                tmp.next = swap.next; // 3
                swap.next = head;
                head = swap;
            }
//            System.out.println(tmp.data);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" -> ", "[", "]");
        Node tmp = head;
        while (tmp != null){
            joiner.add(tmp.data.toString());
            tmp = tmp.next;
        }
        return joiner.toString();
    }


    public static void main(String a[]){
        ReverseLinkList<String> reverseLinkList = new ReverseLinkList<>();
        reverseLinkList.add("1");
        reverseLinkList.add("2");
        reverseLinkList.add("3");
        reverseLinkList.add("4");
        reverseLinkList.add("5");
        System.out.println("Before Reverse : " + reverseLinkList);
        reverseLinkList.reverse();
        System.out.println("After Reverse : " + reverseLinkList);
    }
}
