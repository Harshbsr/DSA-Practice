package practice;

import java.util.HashSet;
import java.util.Set;

/*
Given an integer array arr, return true if any value appears at least twice. Otherwise return false.

Example
Input:  [1, 2, 3, 1]
Output: true
Input:  [1, 2, 3, 4]
Output: false
 */
public class ContainsDuplicate {

    public static boolean isContainsDuplicate(int[] arr){
        if(arr == null){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
       return false;
    }

    public static void main(String [] args){
        int[] arr = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(isContainsDuplicate(arr));
        System.out.println(isContainsDuplicate(arr2));
    }
}
