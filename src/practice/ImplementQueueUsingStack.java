package practice;
/*
Implement a Queue using two Stacks.

Your queue should support:

enqueue(int x) → add element
dequeue()      → remove and return front element
peek()         → return front element

Queue follows FIFO:

First In, First Out

Example
enqueue(10)
enqueue(20)
enqueue(30)

dequeue() → 10
dequeue() → 20

peek() → 30
 */
import java.util.*;
public class ImplementQueueUsingStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    static void enqueue(int value){
        stack1.push(value);
    }

    static int dequeue(){
        if(stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    static int peek(){
        if(!stack2.empty()) {
            return stack2.peek();
        }
        if(!stack1.empty()) {
            return stack1.peek();
        }
      return -1;
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        dequeue();
        peek();

    }
}
