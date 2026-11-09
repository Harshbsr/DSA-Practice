package practice;



/*
Problem statement

Given an integer array nums, find all unique triplets:

nums[i] + nums[j] + nums[k] = 0

Return all such triplets.

Example
Input:
[-1, 0, 1, 2, -1, -4]

Output:

[
    [-1, -1, 2],
    [-1, 0, 1]
]
 */
import java.util.*;
public class ThreeSum {


    public static List<List<Integer>> threeSum(int[] arr){
        if(arr==null){
            throw new IllegalArgumentException("Array is null");
        }
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==arr[i+1]){// to skip duplicate
                continue;
            }
            int left=i+1;
            int right=arr.length-1;
            while(left<right){

                if(arr[left]+arr[right]+arr[i]==0){
                list.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    // Skip duplicate left values
                while(left<right && arr[left]==arr[left+1]){
                    left++;
                }
                    // Skip duplicate right values
                while(left<right && arr[right]==arr[right+1]){
                        right--;
                    }
                left++;
                right--;
                }else if(arr[left]+arr[right]+arr[i]>0){
                    right--;
                }else{
                    left++;
                }
            }

        }
 return list;
    }

    public static void main(String[] args){
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
