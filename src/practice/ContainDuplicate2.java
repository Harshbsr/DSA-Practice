package practice;
/*
Now let's make the previous Contains Duplicate problem a little harder.

Given an integer array nums and an integer k, return true if there are two different indices i and j such that:

nums[i] == nums[j]

and:

|i - j| <= k

Otherwise return false.

Example 1
nums = [1,2,3,1]
k = 3
 */

import java.util.*;
public class ContainDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] num, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(map.containsKey(num[i])){
                if(i-map.get(num[i])<=k){
                    return true;
                }
            }
            map.put(num[i],i);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
