package practice;
/*
Given a sorted array nums and a target value, find the starting and ending position of that target.

If the target doesn't exist, return:

[-1, -1]
Examples
Input:
nums = [5, 7, 7, 8, 8, 10]
target = 8


Output:
[3, 4]
 */
public class SearchTargetFirstAndLastForSortedArray {

    public static int[]  searchTargetFirstAndLast(int[] arr, int target){
        if(arr==null||arr.length==0){
            return new int[] {-1,-1};
        }
        int first = searchFirst(arr,target);
        int last=  searchLast(arr,target);

        return new int[]{first,last};
    }


    public static int searchFirst(int[] arr, int target){

        int low=0;
        int high=arr.length-1;
        int first =-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(target==arr[mid]){
                    first =mid;
                    high= mid-1;
            } else if(target<arr[mid]){
                high= mid-1;
            }else{
                low=mid+1;
            }
        }

        return  first;
    }

    public static int searchLast(int[] arr, int target){

        int low=0;
        int high=arr.length-1;
        int last =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target==arr[mid]){
                    last = mid;
                    low=mid+1;
            } else if(target<arr[mid]){
                high= mid-1;
            }else{
                low=mid+1;
            }
        }

        return last;
    }

    public static void main(String[] args){
        int [] num = {5, 7, 7, 8, 8, 10};

        int [] result =searchTargetFirstAndLast(num,8);

        for(int i:result) {
            System.out.print(i+" ");
        }
    }

}
