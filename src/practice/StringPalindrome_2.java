package practice;

import java.sql.SQLOutput;

/*
Given a string s, return true if s can become a palindrome after deleting at most one character.

Example:

Input:  "abca"
Output: true

Because removing b → "aca" or removing c → "aba".

Input:  "abc"
Output: false
 */
public class StringPalindrome_2 {

    public static boolean isValidPalindrome(String s){
        if(s==null|| s.length()<1){
            return false;
        }
        int left = 0;
        int right= s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
             return innerValidPalindrome( s,left+1,right)||
                 innerValidPalindrome( s,left,right-1);
            }
            left++;
            right--;
        }
       return true;
    }

    public static boolean innerValidPalindrome(String s, int left, int right){

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
        String s = "abca";
        String s2 = "abc";
        System.out.println(isValidPalindrome(s));
        System.out.println(isValidPalindrome(s2));

    }
}
