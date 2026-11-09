package miscellaneous;
/*
Q. Given a string, remove the vowels from the string and return the string without vowels. The string will contains lowercase letters.

Example –

Input: str = "what is your name ?"

Output: "wht s yr nm ?"

Explanation: After removing vowels i.e. { 'a', 'e', 'i', 'o', 'u' }, the string becomes "wht s yr nm ?"
 */

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

    public static String removingVowels(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                newStr.append(ch);
            }
        }
       return  newStr.toString();
    }

    public static String removingVowels2(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if("aeiou".indexOf(ch)==-1){
                newStr.append(ch);
            }
        }
        return  newStr.toString();
    }

    public static String removingVowels3(String str){
        Set<Character> vowels = Set.of('a','e','i','o','u');
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(!vowels.contains(ch)){newStr.append(ch);
            }
        }
        return  newStr.toString();
    }

    public static void main(String[] args){
        String str ="what is your name ?";
        System.out.println("Original String is:"+str);
        String result = removingVowels(str);
        System.out.println(result);

        String result2 = removingVowels2(str);
        System.out.println(result2);

        String result3 = removingVowels3(str);
        System.out.println(result3);
    }
}
