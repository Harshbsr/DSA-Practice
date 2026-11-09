package practice;
/*
Given an array temperatures, return an array where answer[i] is the number of days you have to wait after day i to get a warmer temperature.

If there is no future day with a warmer temperature, put 0.

Example
Input:
temperatures = [73,74,75,71,69,72,76,73]

Output:
[1,1,4,2,1,1,0,0]

For example:

73 → warmer 74 after 1 day
75 → warmer 76 after 4 days
71 → warmer 72 after 2 days
69 → warmer 72 after 1 day
76 → no warmer day → 0
 */
import java.util.*;
public class WarmerTemperature {

     static int[] warmerTemperature(int[] arr){
         int[] result = new int[arr.length];
         Stack<Integer>  stack = new Stack<>();

         for(int i=0;i<arr.length;i++){

             while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                 int index = stack.pop();
                 result[index]= i-index;
             }

             stack.push(i);
         }
         return result;
     }

    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};

        int[] result =warmerTemperature(arr);

        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
