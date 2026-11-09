package miscellaneous;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Copilot said:

Question: Given a string str, find the length of the longest substring without repeating characters.

Examples:

Input: str = "abcabcbb"
 Output: 3
 Explanation: The longest substring without repeating characters is "abc".

Input: str = "bbbb"
 Output: 1
 Explanation: The longest substring without repeating characters is "b".

Input: str = "pwwkew"
 Output: 3
 Explanation: The longest substring without repeating characters is "wke".
 */
public class LongestSubstringWithoutRepeatingCharacters {

 public static int getLongestSubStringLength(String str){
     if( str==null){
         throw new IllegalArgumentException("Invalid Input");
     }
     if(str.isEmpty()){
         return 0;
     }
     Map<Character,Integer> map = new HashMap<>();
     int start=0;
     int maxLength=0;
     for(int end = 0;end<str.length();end++){
         char ch = str.charAt(end);
         if(map.containsKey(ch)){
           start= Math.max(start,map.get(ch)+1);
         }
         map.put(ch,end);
         maxLength= Math.max(maxLength,(end-start+1));
     }
     return maxLength;
 }

    public static int getLongestSubStringLength2(String str){
        if( str==null){
            throw new IllegalArgumentException("Invalid Input");
        }
        if(str.isEmpty()){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int start=0;
        int maxLength=0;
        for(int end=0;end<str.length();end++){
            char ch = str.charAt(end);

            while(set.contains(ch)){
                set.remove(str.charAt(start));
                start++;
            }

            set.add(ch);

            maxLength= Math.max(maxLength,end-start+1);

        }
       return maxLength;
    }
    public static void main(String[] args){
      System.out.println( getLongestSubStringLength2("abcabcbb"));
      System.out.println( getLongestSubStringLength2("bbbb"));
        System.out.println( getLongestSubStringLength2("pwwkew"));
    }
}
