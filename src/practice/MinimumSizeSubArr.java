package practice;
/*
Minimum Size Subarray Sum

Given an array of positive integers nums and a positive integer target, find the minimum length of a contiguous subarray whose sum is greater than or equal to target.

If no such subarray exists, return 0.

Example 1
nums = [2,3,1,2,4,3]
target = 7

Possible subarrays:

[2,3,1,2]     sum = 8   length = 4
[3,1,2,4]     sum = 10  length = 4
[4,3]         sum = 7   length = 2  ← minimum

Output:

2
 */
public class MinimumSizeSubArr {

    public static int minSubArrayLen(int[] arr,int target){

        int windowSum=0;
        int left=0;
        int minLength=Integer.MAX_VALUE;
        for(int i=0; i< arr.length;i++){
            windowSum= windowSum+arr[i];
            while(windowSum>=target){
                minLength=Math.min(minLength,i-left+1);
                windowSum= windowSum-arr[left];
                left++;
            }
        }

       return  minLength==Integer.MAX_VALUE?0:minLength;
    }
    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;


        System.out.println(minSubArrayLen( nums,target));
    }
}
