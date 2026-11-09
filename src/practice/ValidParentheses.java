package practice;
/*
Problem statement

Given a string s containing only the characters:

( ) { } [ ]

determine whether the input string is valid.

A string is valid if:

Every opening bracket has a corresponding closing bracket.
Brackets are closed in the correct order.
Every closing bracket has a matching opening bracket.
Examples
Input:  s = "()"
Output: true
Input:  s = "()[]{}"
Output: true
Input:  s = "(]"
Output: false
 */
import java.util.*;
public class ValidParentheses {

    public static boolean isValidParentheses(String s){
        if(s==null || s.length()==0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i!=s.length()){
            char ch=s.charAt(i);
            if(ch=='[' || ch == '{'|| ch=='('){
                stack.push(ch);

            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ch2= stack.pop();

                if((ch == ']' && ch2!='[')
                        || (ch =='}' && ch2!='{')
                        || (ch ==')'&& ch2!='(')){
                    return false;
                }
            }
          i++;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){

        System.out.println(isValidParentheses("()"));
        System.out.println(isValidParentheses("()[]{}"));
        System.out.println(isValidParentheses("(]"));
    }
}
