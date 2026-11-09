package searching;

public class BinarySearch {
  // if array is sorted then instead on linar array we can dicide the search space by half
  // and search in that half only it will reduce the time complexity from O(n) to O(log n)
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
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr1 = {1, 4, 8, 9, 11};

        System.out.println(bs.search(arr1, arr1.length, 9));
        System.out.println(bs.search(arr1, arr1.length, 80));


    }

}
