package pk.com.uog.DSA_stacks;

import java.util.EmptyStackException;


public class StackUsingArray {

    private int arr[];
    private int size;
    private int index = 0;

    public StackUsingArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {

        if (isFull()) {
            throw new StackOverflowError("Sorry! Stack is full----OverFlow happened");
        }

        arr[index] = element;
        index++;
    }

    public int pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[--index];
    }

    public int peek() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int peekIndex = index - 1;
        return arr[peekIndex];
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public int size() {
        return index;
    }

    public static void main(String[] args) {
        System.out.println("Implementation of Stack ADT using Arrays");
        StackUsingArray stack = new StackUsingArray(5);
        System.out.println("1. Pushing Elements on to the Stack");
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2. Size of stack after push operations : " + stack.size());
        System.out.println("3. Peek of stack after push operations: " + stack.peek());

        System.out.printf("4. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n5. Size of stack after pop operations : " + stack.size());
    }
}
