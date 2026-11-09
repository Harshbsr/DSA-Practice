package practice;
/*
Sliding Window — Maximum Sum Subarray of Size K
We need:

arr = [2, 1, 5, 1, 3, 2]
k = 3

Find the maximum sum of any contiguous subarray of size 3.
Think about the window
First window:

[2, 1, 5]  → sum = 8
 */
import java.util.*;
public class MaxSubArr {

    public static int maxSubArrSum(int[] arr,int k) {
        if (arr == null || arr.length == 0 || k==0 || k>arr.length) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int windowSum = 0;
        for(int i=0; i<k;i++){
            windowSum = windowSum+arr[i];
        }
        int maxSum= windowSum;
        int left = 0;
        for(int j=k;j<arr.length;j++){
            windowSum=windowSum+arr[j]-arr[left];
            maxSum= Math.max(maxSum,windowSum);
            left++;
        }

        return maxSum;
    }
    public static void main(String[] args) {
      int[] arr ={2, 1, 5, 1, 3, 2};
        System.out.println(maxSubArrSum(arr,3));
    }
}
