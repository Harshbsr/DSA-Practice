package practice2;

import java.util.HashMap;

public class FirstNonRepeatingChar {

    //Find the first non-repeating character-
    // for n non-repeating character can use count
    /*
     int count=0
 for(int i=0;i<s.length();i++){
 char ch = s.charAt(i);

 if(map.get(ch)==1){
 count++;
 if (count==2){
 return ch;
 }
 }

 }
     */

    public static char firstNonRepeatingChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){

                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(map.get(ch)==1){
                return ch;
            }

        }

        return '\0';
    }


    public static char firstNonRepeatingChar1(String s){
        int[] freq = new int[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(freq[ch-'a'] == 1){
                return ch;
            }
        }

        return '\0';
    }

}
