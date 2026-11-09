package practice;
/*
Problem

Given an integer array nums, find the contiguous subarray with the largest sum and return that sum.

Example 1
Input:
nums = [-2,1,-3,4,-1,2,1,-5,4]


Output:
6

Because:

[4,-1,2,1]
 */
public class KadaneAlgo {

    public static int getMaxSubArrSum(int[] arr){
        int maxSubArrSun=arr[0];
        int currentMax=arr[0];
        for(int i=1;i<arr.length;i++){
            currentMax=Math.max(currentMax+arr[i],arr[i]);
            maxSubArrSun=Math.max(maxSubArrSun,currentMax);

        }
  return maxSubArrSun;
    }
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(getMaxSubArrSum(arr));
    }
}
/*
If the interviewer asks "Why do you take Math.max(currentMax + arr[i], arr[i])?", say:

"At each index, I have two choices: either include the current element in the previous subarray, or discard the previous subarray and start a new subarray from the current element. I choose whichever gives the larger sum.
 */