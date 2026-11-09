package miscellaneous;

import java.util.HashMap;
import java.util.Map;

/*
Q. Given an array of integers, return indices of the two numbers such that they add up to a specific target.

Example –

Given array of integers – {2,11,5,10,7,8}, target = 9

Solution –

Since, arr[0] + arr[4] = 2 + 7 = 9, return {0, 4} indices.
 */
public class TwoSumProblem {

    public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int [] {-1,-1};
    }

    public static void main(String[] args ){

        int[] arr = {2,11,5,10,7,8};
        int[] result = twoSum(arr,9);
        for(int i:result){
            System.out.print(i+" ");
        }

    }
}
