package data_structures;

import java.util.*;

public class JavaCollections {

    public static void main(String[] args) {
        JavaCollections javaCollections = new JavaCollections();
        javaCollections.testLinkedList();
        javaCollections.testHashMap();
        javaCollections.testHashSet();
        javaCollections.testTreeSet();
        javaCollections.testLinkedHashSet();
        javaCollections.testTreeMap();
        javaCollections.testStack();
        javaCollections.testQueue();
        javaCollections.testPriorityQueue();
        javaCollections.testString();
        javaCollections.testStringBuilder();
    }

    public void testArrayList() {
        List<String> list = new ArrayList<>();
        Collections.shuffle(list);
    }

    public void testLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Hi");
        list.addFirst("There");

        System.out.println(list);
    }

    public void testHashMap() {
        System.out.println("\nTest HashMap:");
        //Sorts automatically
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "XX"); //single null key allowed
        map.put("AA", "AA");
        map.put("CC", "CC");
        map.put("CCC", "CCC");
        map.put("BB", "BB");
        map.put("AA", "AA-NEW");

        map.putIfAbsent("1", "99");
        map.putIfAbsent("1", "88"); //was ignored
        map.computeIfAbsent("2", key -> String.valueOf(key.length() + 100));
        map.computeIfPresent("BB", (key, value) -> String.valueOf(key.length() + value.length()));

        System.out.println(map);

        //Advanced example
        Map<Integer, List<Integer>> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(99);
        hm.put(1, list);
        hm.computeIfAbsent(4, key -> new ArrayList<>()).add(100);

        hm.putIfAbsent(2, null);
        System.out.println(hm);
    }

    //Only difference with HashMap is it maintains insertion order of keys
    public void testLinkedHashMap() {

    }

    public void testConcurrentHashMap() {

    }

    public void testHashSet() {
        System.out.println("\nTest HashSet:");
        //Doesn't data_structures.sort
        HashSet<String> set = new HashSet<>();
        set.add("AA");
        set.add("CC");
        set.add("CCC");
        set.add("BB");
        set.add("AA");
        set.forEach(System.out::println);
    }

    public void testTreeSet() {
        System.out.println("\nTest TreeSet:");
        //Sorts automatically (ascending)
        TreeSet<String> set = new TreeSet<>();
        set.add("AA");
        set.add("CC");
        set.add("CCC");
        set.add("BB");
        set.add("AA");
        set.forEach(System.out::println);
    }

    public void testLinkedHashSet() {
        System.out.println("\nTest LinkedHashSet:");
        //Maintains insertion order
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("XX");
        set.add("AA");
        set.add("CC");
        set.add("CCC");
        set.add("BB");
        set.add("AA");
        set.remove("CCC");
        set.forEach(System.out::println);
    }

    public void testTreeMap() {
        System.out.println("\nTest TreeMap:");
        //Sorts keys automatically
        TreeMap<String, String> map = new TreeMap<>();
        map.put("AA", "AA");
        map.put("CC", "CC");
        map.put("CCC", "CCC");
        map.put("BB", "BB");
        map.put("AA", "AA");
        map.keySet().forEach(System.out::println);
    }

    //Only difference with HashMap is it doesn't allow any null key or value
    public void testHashTable() {

    }

    public void testCollectionSort() {

    }

    public void testStack() { //LIFO
        System.out.println("\nTest Stack:");
        java.util.Stack<String> stack = new java.util.Stack<>();
        stack.add("hi");
        stack.add("hello");

        System.out.println(stack.peek()); //Only return
        System.out.println(stack.pop()); //Return and remove top from the data_structures.stack
        System.out.println(stack.remove(0)); //by index
        System.out.println(stack.empty());
    }

    public void testQueue() { //FIFO
        System.out.println("\nTest Queue:");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(1);
        queue.add(3);

        System.out.println(queue.peek()); //Only return
        System.out.println(queue.poll()); //Return and remove from bottom of queue
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }

    //Only difference with Queue is it sorts elements
    //Also known as a heap Data-Structure in Java
    //Read more about https://stackoverflow.com/questions/25569625/sorting-priority-queue-in-java
    //Min heap and Max heap
    public void testPriorityQueue() {
        System.out.println("\nTest PriorityQueue:");
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("X");
        queue.add("Y");
        queue.add("A");

        System.out.println(queue);

        System.out.println(queue.peek()); //Only return
        System.out.println(queue.poll()); //Return and remove from top of queue
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
//        queue.offer()
    }

    public void testString() {
        String s = "some string";
        char c = s.charAt(0);
        char[] cArray = s.toCharArray();
        boolean b = s.contains("s");
        s.indexOf("s");
        s.lastIndexOf("s");
        s.length();
        s.toLowerCase();
        s.toUpperCase();
        s.replace("s", "a"); //replace all 's'
        s.replaceFirst("s", "a"); //replace first s
        s.equals("");
        s.isEmpty();
        s.split("\\s+"); //includes multiple white space
        s.substring(0, 3); //returns a new string using the provided indexes
    }

    public void testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("some string");
        sb.reverse();
        sb.length();
        sb.toString(); //converts to String
        sb.deleteCharAt(2);
        sb.delete(0, 2);
    }
}
