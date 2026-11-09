package practice;
/*
Given a sorted array of distinct integers nums and an integer target, return the index if the target is found.

If the target is not found, return the index where it would be inserted to maintain the sorted order.

Example 1
Input:
nums = [1,3,5,6]
target = 5
Output:
2

Example 2
Input:
nums = [1,3,5,6]
target = 2

Output:
1
 */
public class SearchInsertionPosition {

    public static int searchInsertionPosition(int[] arr, int target){
        if(arr==null || arr.length==0){
            return -1;
        }

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                low=mid+1;
            }else{
                high= mid-1;
            }
        }
return low;
    }

    public static void main(String[] args) {
        System.out.println(searchInsertionPosition(new int[]{1,3,5,6},2));
    }
}
