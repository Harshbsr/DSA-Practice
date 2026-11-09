package hashing;

/*
Q. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Input: nums = [1,2,3,1]
 Output: true

Input: nums = [1,2,3,4]
 Output: false

 First approach-compare each element with other element
 two for loop i and nested j  log(n^2)

 Second approach-sort the array and compare element to next element if it matches
  then return true else return false nlog(n)

 Third-using has set check if set has the value if yes return true  log(n)

 */


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {


    public boolean containsDuplicate(int[] arr){

       Set<Integer> set = new HashSet<>(arr.length);

       for(int i=0;i< arr.length; i++){
           if(set.contains(arr[i])){
               return true;
           }
           set.add(arr[i]);
       }

        return false;
    }


    public static void main(String[] args){
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] arr = {1,1,2,3,4,5,6,7,8,9,10};
        System.out.println(cd.containsDuplicate(arr));
    }
}
