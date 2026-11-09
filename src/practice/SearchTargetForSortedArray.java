package practice;
/*
Problem statement

Given a sorted array of distinct integers nums and an integer target, return the index of target if it exists.

If target does not exist, return -1.

Examples
Input:
nums = [-1, 0, 3, 5, 9, 12]
target = 9


Output:
4
 */
public class SearchTargetForSortedArray {

    public static int searchTarget(int[] arr, int target){
        if(arr==null){
            return -1;
        }

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(target==arr[mid]){
                return mid;
            } else if(target<arr[mid]){
                high= mid-1;
            }else{
                low=mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int [] num = {-1, 0, 3, 5, 9, 12};

        System.out.println(searchTarget(num,9));
    }

}
