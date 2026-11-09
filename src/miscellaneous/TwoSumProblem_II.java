package miscellaneous;

import java.util.HashMap;
import java.util.Map;

/*
Text from the image:

Q. Given an array of integers, return pair of numbers such that they add up to a specific target.

Example –

Given array of integers – {2,11,5,10,7,8}, target = 9

Solution –

Since, arr[0] + arr[4] = 2 + 7 = 9, return {2, 7}.
 */
public class TwoSumProblem_II {

    public static int[] twoSum(int[] arr, int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{arr[i],target-arr[i]};
            }else{
                map.put(arr[i],i);
            }

        }
         return new int [] {-1,-1};
    }

    public static void main(String[] args){
        int[] arr = {2,11,5,10,7,8};
        int[] result = twoSum(arr,9);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
