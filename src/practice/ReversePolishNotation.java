package practice;
/*
Given an array of strings tokens representing an arithmetic expression in Reverse Polish Notation (RPN), evaluate the expression and return the integer result.

Valid operators are:

+  -  *  /

Each operand may be an integer or another expression.

Examples
Input:
tokens = ["2","1","+","3","*"]

Output:
9

Because:

(2 + 1) * 3 = 9
Input:
tokens = ["4","13","5","/","+"]

Output:
6
 */
import java.util.*;
public class ReversePolishNotation {

    public static int rmr(String[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }

        Stack<Integer> stack = new Stack<>();

        for(String str:arr){
            if(str.equals("/") ||str.equals("*") || str.equals("+") || str.equals("-") ){
                int right = stack.pop();
                int left = stack.pop();

                switch(str){
                    case"+":
                        stack.push(right+left);
                        break;
                    case"-":
                        stack.push(left-right);
                        break;
                    case"*":
                        stack.push(left * right);
                        break;
                    case "/":
                        stack.push(left / right);
                        break;
                }

            } else{
                stack.push(Integer.parseInt(str));
            }
        }

     return stack.peek();
    }

    public static void main(String[] args){
        System.out.println(rmr(new String[]{"2","1","+","3","*"}));
    }
}
