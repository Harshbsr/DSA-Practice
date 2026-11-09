package miscellaneous;

/*
Q. Given a string s, return the index of the first non-repeating character in it. If it does not exist, return -1. The string will only contain lowercase letters.

Example 1

Input: str = "codeforcode"
 Output: 4

Explanation: The first non-repeating character is 'f' and is found at index 4.

Example 2

Input: str = "aabb"
 Output: -1

Explanation: It doesn't have any non-repeating character.

we also solve this problem using ASCII code as well
 */

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static int firstNonRepeatingCharUsingMap(String str){
        if(str==null || str.isEmpty()){
            return -1;
        }
        str= str.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }

        return -1;

    }

    public static int firstNonRepeatingCharUsingASCII(String str){
        if(str==null || str.isEmpty()){
            return -1;
        }
        str= str.toLowerCase();

        int[] feq = new int[26];

        for(int i=0;i<str.length();i++){
            feq[str.charAt(i)-'a']++;
        }

        for(int i=0;i<str.length();i++){
           if(feq[str.charAt(i)-'a']==1) {
               return i;
           }
        }


        return -1;
    }
    public static void main(String[] args){
        String  str1 = "codeforcode";
        String  str2 = "abab";
        String  str3 = "abaBbfg";
        System.out.println("Using Map");
        System.out.println(firstNonRepeatingCharUsingMap(str1));
        System.out.println(firstNonRepeatingCharUsingMap(str2));
        System.out.println(firstNonRepeatingCharUsingMap(str3));
        System.out.println("Using ASCII");
        System.out.println(firstNonRepeatingCharUsingASCII(str1));
        System.out.println(firstNonRepeatingCharUsingASCII(str2));
        System.out.println(firstNonRepeatingCharUsingASCII(str3));





    }

}
