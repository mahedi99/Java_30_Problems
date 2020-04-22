package stack;

public class Stack {
    private int[] stack;
    private int size = 0;

    public Stack(int capacity){
        stack = new int [capacity];
    }

    public void push(int value){

        if (!isFull()){
            stack[size] = value;
            size++;
        }
        else {
            throw new StackOverflowError();
        }
    }
    public void pop(){
        if (!isEmpty()){
            size-- ;
        }

    }

    public boolean isEmpty() {
        return  (stack != null && size > 0) ? false : true;
    }

    public boolean isFull() {
        return (stack != null &&stack.length == size) ? true : false;
    }

    public int peek(){
        return isEmpty() ? -1 : stack[--size];
    }

    public int getSize(){
        return size;
    }
}
