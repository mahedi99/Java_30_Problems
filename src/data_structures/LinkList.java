package data_structures;

/**
 * @author Mahedi Hassan
 * 2020-09-02
 */

class Node{
    public String data;
    public Node next;
    public Node(String data){
        this.data = data;
    }
}

class LinkList {
    private Node head;
    public void add(String data){
        Node item = new Node(data);
        if (head == null){
            head = item;
        }
        else {
            Node tmpHead = head;
            while (tmpHead.next != null){
                tmpHead = tmpHead.next;
            }
            tmpHead.next = item;
        }
    }
    public boolean search(String data){
        if(head != null){
            Node tempHead = head;
            while (tempHead != null){
                if (tempHead.data.equals(data)){
                    return true;
                }
                tempHead = tempHead.next;
            }
        }
        return false;
    }

    public void addFirst(String data){
        Node item = new Node(data);
        if (head == null){
            head = item;
        }
        else {
            Node tmpHead = head;
            head = item;
            head.next = tmpHead;
        }
    }

    public boolean remove(String data){
        if(head != null){
            Node tmpHead = head;
            Node prevNode = null;
            while (tmpHead != null){
                if (tmpHead.data.equals(data)){
                    if (prevNode != null){
                        prevNode.next = tmpHead.next;
                    }
                    else {
                        head = tmpHead.next;
                    }
                    return true;
                }
                prevNode = tmpHead;
                tmpHead = tmpHead.next;
            }
        }
        return false;
    }

    public void reverse(){
        if (head.next != null){
            Node tmp = head;
            Node swap;
            while (tmp.next != null){
                swap = tmp.next;
                tmp.next = swap.next;
                swap.next = head;
                head = swap;
            }
        }
    }


    public static void main(String args[]){
        LinkList linkList = new LinkList();
        linkList.add("one");
        linkList.add("two");
        linkList.add("three");

//        linkList.addFirst("zero");

        //linkList.remove("two");
        linkList.reverse();

        Node tmpHead = linkList.head;
        while (tmpHead !=null){
            System.out.println(tmpHead.data);
            tmpHead = tmpHead.next;

        }



//        System.out.println(linkList.search("five"));
    }
}
