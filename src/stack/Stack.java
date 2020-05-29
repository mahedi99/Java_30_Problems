package stack;

public class Stack {
    private int[] stack;
    private int top = -1;

    public Stack(int capacity){
        stack = new int [capacity];
    }

    public void push(int value){

        if (!isFull()){
            top++;
            stack[top] = value;
        }
        else {
            throw new StackOverflowError();
        }
    }
    public int pop(){
        return !isEmpty() ? stack[top--] : -1;
    }

    public boolean isEmpty() {
        return  (stack == null || top == -1);
    }

    public boolean isFull() {
        return (stack != null && (stack.length - 1) == top);
    }

    public int peek(){
        return isEmpty() ? -1 : stack[top];
    }
}
