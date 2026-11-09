package practice;
/*
Find Minimum in Rotated Sorted Array
Input:
nums = [3,4,5,1,2]


Output:
1
 */
public class SearchMinInRotatedSortedArray {

    public static int searchMin(int[] arr){
        if(arr==null || arr.length==0){
            return -1;
        }
        int low = 0;
        int high= arr.length-1;

        if(arr[low]<arr[high]){
            return arr[low];
        }
       while(low<high){
           int mid = (low+high)/2;
           if(arr[mid]>arr[high]){
               low=mid+1;
           }else{
               high=mid;
           }
       }


return arr[low];
    }

    public static void main(String [] args){
        System.out.println(searchMin(new int[]{3,4,5,1,2}));
    }

}
