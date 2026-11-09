package practice;
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all elements of nums except nums[i].

Example
Input:
nums = [1, 2, 3, 4]
Output:
[24, 12, 8, 6]
 */
public class ProductOfArrExceptSelf {

    public static int[] productOfArr(int[] arr){
        //1, 2, 3, 4   //24, 12, 8, 6
        int[] result = new int[arr.length];
        int left=1;
        int right=1;
        for(int i=0;i<arr.length;i++){
            result[i]=left;
            left= left*arr[i];

        }

        for(int k= arr.length-1; k>=0;k--){
          result[k]=result[k]* right;
            right=right* arr[k];

        }
        return result;
    }



    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4};
        int[] result= productOfArr(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
