package practice;
/*
Given a string s, return true if it is a palindrome.

A palindrome reads the same forward and backward.

Example 1
Input:
s = "madam"


Output:
true
 */

public class StringPalindrome {

    public static boolean isPalindrome(String s){
        if(s==null){
            return false;
        }
        int left= 0;
        int right= s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

     return true;
    }

    public static void main(String[] args){
            String s ="madam";
        System.out.println(isPalindrome(s));
    }
}
