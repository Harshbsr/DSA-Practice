package practice2;

import java.util.HashMap;

public class MaxOccuringChar {

   // Find the maximum-occurring character


    public static char maxChar(String s){


        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

        }
        int max= 0;
        char c = ' ';
        for(Character key: map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                c=key;
            }

        }

        return c;

    }

    /*
    in string there could be space pantuations so use

     for(int i=0;i<s.length();i++){
     char ch = s.charAt(i);
     if (ch >= 'a' && ch <= 'z') {
        freq[ch - 'a']++;
    }
     }
    */
    public static char maxChar2(String s){
        s= s.toLowerCase();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        int max=0;
        // int secondMax=0;
        // char c2 =' ';
        char c= ' ';
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
               // secondMax=max;
                max= freq[i];
                c = (char) (i+'a');
            }
            /*
            else if(freq[i]>secondMax && freq[i] <max){
            secondMax= freq[i];
                c2 = (char) (i+'a');
            }
             */
        }

        return c;
    }
}
