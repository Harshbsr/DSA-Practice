package practice;
/*
This is our Sliding Window introduction. It's a very important interview pattern.

Problem

Given a string s, find the length of the longest substring without repeating characters.

Example 1
Input:  "abcabcbb"
Output: 3
 */
import java.util.*;
public class LongestSubstring {

    public static int lengthOfLongestSubstring(String str){
        int left=0;
        int maxLength=0;
        Set<Character> set = new HashSet<>();
        for(int right=0;right<str.length();right++){
            char ch = str.charAt(right);
            while(set.contains(ch)){
              set.remove(str.charAt(left));
              maxLength= Math.max(maxLength,right-left);
              left++;
            }
            set.add(ch);

        }

      return  maxLength;
    }

    public static void main(String[] args) {

        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
