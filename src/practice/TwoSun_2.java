package practice;
/*
Problem statement

You are given a sorted array of integers and a target.
Find two numbers whose sum equals the target.
Return their indices.

Example
Input:
numbers = [2,7,11,15]
target = 9

We need:

2 + 7 = 9

So output:

[1, 2]
 */
import java.util.*;
public class TwoSun_2 {

    public static int[] twoSum(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid Input");
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            if(map.containsKey(target-arr[i])){
                return new int[]{i,map.get(target-arr[i])};
            }

            map.put(arr[i],i);

        }

        return new int[]{-1,-1};
    }

    public static int[]  twoSumSortedArr(int[] arr, int target){
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int left=0;
        int right=arr.length-1;
        while(left< right) {
            int sum =arr[left] + arr[right];
            if(sum==target){
                return new int[]{left,right};
            }else if(sum>target){
                right--;
            } else{
                left++;
            }
        }
return new int[]{-1};
    }
    public static void main(String[] args){
     int[] result=twoSumSortedArr(new int[]{2,7,11,15},9);
     for(int i:result){
         System.out.print(i+" ");
     }
    }
}
