package stack;

import java.util.Stack;

public class validParentheses {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(char c:ch){
            if(c=='['|| c=='{'|| c=='('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top= stack.peek();
                    if((c==']'&& top=='[') ||(c=='}'&& top=='{') ||(c==')'&& top=='(') ){
                        stack.pop();
                    }
                }
            }
        }
       return  stack.isEmpty();
    }

    public static void main(String[] args){
        String s1= "}])";
        String s2="[{)";
        String s3="(}[]";
        String s4="()";
        String s5="[{()}]";

        System.out.println("s1 is: "+ isValid(s1));
        System.out.println("s2 is: "+ isValid(s2));
        System.out.println("s3 is: "+ isValid(s3));
        System.out.println("s4 is: "+ isValid(s4));
        System.out.println("s5 is: "+ isValid(s5));

    }
}
