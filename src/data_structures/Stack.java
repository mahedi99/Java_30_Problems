package data_structures;

import java.util.Arrays;

/**
 * @author Mahedi Hassan
 * 2020-09-06
 */

public class Stack {
    private int[] stack;
    private int size = -1;
    public Stack(int capacity){
        stack = new int[capacity];
    }

    public void push(int data){
        if (isFull()){
            return;
        }
        else {
            size++;
            stack[size] = data;

        }
    }

    public int pop(){
        if (!isEmpty()){
            return stack[size--];
        }
        return -1;
    }

    public boolean isEmpty(){
        return size < 0;
    }
    public boolean isFull(){
        return size == stack.length;
    }
    public int peek(){
        if (!isEmpty()){
            return stack[size];
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String a[]){
        Stack stack = new Stack(3);
        stack.pop();
        stack.push(7);
        stack.push(9);
        stack.push(8);
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.size);
    }
}
