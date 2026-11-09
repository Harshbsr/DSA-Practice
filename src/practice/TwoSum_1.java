package practice;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums and an integer target, return the indices of the two numbers such that they add up to target.

You may assume that each input has exactly one solution, and you may not use the same element twice.

Example:

Input:
nums = [2, 7, 11, 15]
target = 9

Output:
[0, 1]
 */
public class TwoSum_1 {

    public static int[] twoSum(int[] arr , int target){
        if(arr==null || arr.length<2 ){
            return new int[0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }

            map.put(arr[i],i);
        }

        return new int[0];
    }

    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15};

       int[] result = twoSum(arr,9);

        for(int i: result){
            System.out.print(i+" ");
        }
    }
/*
"For every element in the array, I calculate the complement by subtracting the current element from the target: target - arr[i]. This complement is the value that I need to find to form the target sum.

I use a HashMap where the key is the previously visited array element and the value is its index. If the complement already exists as a key in the map, it means I have found the required pair. I return the index stored in the map and the current index.

If the complement doesn't exist, I store the current element as the key and its index as the value, so that future elements can find it."
 */

}
