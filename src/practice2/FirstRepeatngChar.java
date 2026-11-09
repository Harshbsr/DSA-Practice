package practice2;

import java.util.HashSet;

public class FirstRepeatngChar {

    //Find the first repeating character

    public static char repeatingChar(String s){

        s=s.toLowerCase();

        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (freq[ch-'a'] >1){
                return ch;
            }
        }

        return '\0';

    }

    public static char repeatingChar2(String s){

        s=s.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                return ch;
            }else{
                set.add(ch);
            }

        }
        return '\0';
    }

}
