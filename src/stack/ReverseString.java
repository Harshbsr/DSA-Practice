package stack;

import java.util.Stack;

public class ReverseString {

    public String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();

        for( char c: ch){
            stack.push(c);
        }
      for(int i=0;i< str.length();i++){
          ch[i]=stack.pop();
      }
      return new String(ch);
    }

    public static void main(String[] args){
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("ABCD"));
    }
}



