package com.example.flyspringbootdemo.data;

/**
 * @author GEEX616
 * @create 2019-08-16 12:37
 * @desc  核心思想就是先进后出lifo(区别于fifo 先进先出)
 **/
public class Mystack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    public Mystack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    public void push(long j) {
        stackArray[++top] = j;
    }
    public long pop() {
        return stackArray[top--];
    }
    public long peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public static void main(String[] args) {
        Mystack theStack = new Mystack(10);
        System.out.println(theStack.top);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
