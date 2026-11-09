package practice;
/*
Problem statement only:

Given a sorted array that has been rotated at an unknown position, and a target value, return the index of the target.

If the target doesn't exist, return -1.

Example:

Input:
nums = [4,5,6,7,0,1,2]
target = 0
Output:
4

Input:
nums = [4,5,6,7,0,1,2]
target = 3

Output:
-1
 */
public class SearchRotatedSortedArray {

   public static int searchRotatedSortedArray(int[] arr, int target){

       if(arr==null || arr.length==0){
           return -1;
       }

       int low = 0;
       int high= arr.length-1;

       while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid]==target){
               return mid;
           }
           if(arr[low]<= arr[mid]) {
               if (target >= arr[low] && target < arr[mid]) {
               high= mid-1;
               } else{
                   low=mid+1;
               }
           }else{
               if (target >arr[mid] && target <= arr[high]) {
                   low= mid+1;
               } else{
                   high=mid-1;
               }

           }

       }
     return -1;
   }
    public static void main(String [] args ){
        System.out.println(searchRotatedSortedArray(new int[]{4,5,6,7,0,1,2},0));

    }
}
