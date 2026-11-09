package searching;

public class SearchInsertArr {

    /*
 Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

The algorithm should run in O(log n) time.

Example -

Input: arr = {1,3,5,7}, target = 5

Output: 2

Input: arr = {1,3,5,7}, target = 2

Output: 1

Input: arr = {1,3,5,7}, target = 8

Output: 4

Input: arr = {1,3,5,7}, target = 0

Output: 0
     */


    public int search( int [] arr, int n,int x){
        if(n==0){
            System.out.println("array is empty");
            return -1;
        }
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(x<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        SearchInsertArr bs = new SearchInsertArr();
        int[] arr1 = {1, 4, 8, 9, 11};
        //            0  1  2  3   4  5
        System.out.println(bs.search(arr1, arr1.length, 9));
        System.out.println(bs.search(arr1, arr1.length, 7));// if we insert 7 then we insert it at index 2
        System.out.println(bs.search(arr1, arr1.length, 0));
        System.out.println(bs.search(arr1, arr1.length, 16));
    }
}
