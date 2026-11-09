package practice;
/*
Problem statement

Given two strings s1 and s2, return true if s2 contains a permutation of s1.
Otherwise, return false.
What is a permutation?

For:
s1 = "ab"

Possible permutations are:
"ab"
"ba"

So if s2 contains either "ab" or "ba" as a substring, return true
Example 1
s1 = "ab"
s2 = "eidbaooo"

Output:

true

Because s2 contains:

eid[ba]ooo
   ↑↑

"ba" is a permutation of "ab"
 */

import java.util.*;

public class PermutationInString {

    public static boolean isValidPermutation(String s1, String s2){
       if(s1==null || s2==null|| s1.length()> s2.length()){
           return false;
       }
       s1=s1.toLowerCase();// to handle if string is uppercase
       s2=s2.toLowerCase();
       int n1 = s1.length();
       int n2= s2.length();

       int[] arr1= new int [26];
       int[] arr2 = new int[26];


       for(int i=0;i<n1;i++){
           char ch= s1.charAt(i);
           arr1[ch-'a']++;
       }

        for(int j=0;j<n1;j++){
            char ch= s2.charAt(j);
            arr2[ch-'a']++;
        }

        if(Arrays.equals(arr1, arr2)){
            return true;
        }

       for(int k=n1;k<n2;k++ ){
           char ch= s2.charAt(k);
           int left = k-n1;
           arr2[ch-'a']++;
           arr2[s2.charAt(left)-'a']--;

           if(Arrays.equals(arr1, arr2)){
               return true;
           }
       }
       return false;
    }



    public static void main(String[] args) {
        String s1="ab";
        String s2 ="fesdbatd";

        System.out.println(isValidPermutation(s1,s2));

    }


}
