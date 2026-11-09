package practice;

import java.util.*;

/*
Given an array of integers heights representing the heights of bars in a histogram, where each bar has a width of 1, return the largest rectangular area that can be formed.

Example
Input:
heights = [2,1,5,6,2,3]


Output:
10

Because the largest rectangle is:

5 × 2 = 10

using the bars 5 and 6.
 */
public class LargestRectangleHistogram {

    public static int largestHistogram(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int maxArea=0;

        for(int i=0; i<=arr.length;i++){

            int currentArr= i==arr.length?0:arr[i];
            while(!stack.empty() && currentArr< arr[stack.peek()]){
                int index = stack.pop();
                int height = arr[index];

                int width=0;

                if(stack.empty()){
                    width=i;
                }else{
                    width = i-stack.peek()-1;
                }

                int area = height * width;

                maxArea= Math.max(maxArea,area);
            }
            if (i < arr.length) {
                stack.push(i);
            }
        }

return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(largestHistogram(new int[]{2,1,5,6,2,3}));

    }
}
