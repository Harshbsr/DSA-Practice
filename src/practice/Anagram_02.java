package practice;

import java.util.HashMap;
import java.util.Map;

/*
An anagram contains exactly the same characters with the same frequencies, but possibly in a different order.

Example 1
Input:
s = "anagram"
t = "nagaram"

Output:
true
 */
public class Anagram_02 {

    public static boolean isAnagram(String s1, String s2){
        if( s1==null|| s2== null||s1.length()!=s2.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i< s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            map.put(ch1,map.get(ch1)+1);
            map.put(ch2,map.get(ch2)-1);
        }

       for(int count:map.values()){
           if(count !=0){
               return false;
           }
       }
       return true;
    }

    public static void main(String[]args){
     String s1 ="anagram";
     String s2="nagaram";
     System.out.println(isAnagram(s1,s2));
    }
}
