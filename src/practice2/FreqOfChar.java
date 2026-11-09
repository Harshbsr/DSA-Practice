package practice2;

import java.util.HashMap;

public class FreqOfChar {
    //Count character frequencies
    public static void  freq(String s){
         s = s.toLowerCase();
        int[] freq = new int [26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;

        }

        for(int j=0;j<freq.length;j++){
            if(freq[j]>0){
                System.out.println("count of "+( char) (j+'a')+ "is:" + freq[j] );

            }

        }

    }


    public static void  freqMap(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){

                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

        }
        for(Character  key :map.keySet()){
            System.out.println(key+" : "+ map.get(key));
        }
 /*
  map.forEach((key,value) -> System.out.println(key+ " : "+ value));

 */

    }
}
