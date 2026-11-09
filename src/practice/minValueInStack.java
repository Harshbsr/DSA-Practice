package practice;
/*
Design a stack that supports the following operations:

push(int val)
pop()
top()
getMin()

getMin() should return the minimum element currently in the stack.

Example
push(-2)
push(0)
push(-3)

getMin() → -3

pop()

top() → 0

getMin() → -2
 */
import java.util.*;
public class minValueInStack {

    static Stack<Integer>  stack = new Stack<>();
    static Stack<Integer>  minStack = new Stack<>();

    public static void pushValue(int value){
        stack.push(value);

        if(minStack.isEmpty()){
            minStack.push(value);
        }else{
            int min=Math.min(minStack.peek(),value);
            minStack.push(min);
        }
    }

    public static int getMin(){
        return minStack.peek();
    }

    static int top(){
        return stack.peek();
    }
    static int pop(){
        minStack.pop();
        return stack.pop();
    }
    public static void main(String[] args){
        pushValue(-8);
        pushValue(0);
        pushValue(-4);
        pushValue(3);

        System.out.println(getMin());


    }
}
