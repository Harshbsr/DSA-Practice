package miscellaneous;

import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/*
Text from the image:

Q. Given an array of distinct integers, print all such triplets such that they add up to a specific target. The triplet should be ordered in ascending order.

Example

Given array of integers = {2,4,3,7,1,8,9,0}, target = 6

Solution

Print: {0, 2, 4}, {1, 2, 3}
 */
public class ThreeSumProblem {

    public static List<List<Integer>> sum(int[] arr, int target){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<arr.length-2;i++){

            int j=i+1;
            int k=arr.length-1;

            while(j<k){
                int sum= arr[i]+arr[j]+arr[k];
                if(sum==target){
                   list.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                } else if(sum>target){
                    k--;
                } else{
                    j++;
                }
            }
        }

        return list;
    }

    public static void main(String [] args) {
        int[] arr = {2, 4, 3, 7, 1, 8, 9, 0};

       List<List<Integer>> result = new ArrayList<>();
        result= sum(arr,6);
        System.out.println(result);



    }
}
