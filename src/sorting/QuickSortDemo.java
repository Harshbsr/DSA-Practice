package sorting;

public class QuickSortDemo {


     public void sort( int[] arr, int low, int high){
         if(low<high){
             int p= partition(arr,low,high);
             sort(arr,low,p-1);
             sort(arr,p+1,high);
         }
     }


    public int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i=low;
        int j= low;
        while(i<=high){
            if(arr[i]<=pivot){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
      return j-1;
    }

    /*
     low to j-1 smaller to pivot
     j to i greater to pivot
     i to high need to be traverse
      */
    public void printArr(int[] arr, int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String args[]){
        QuickSortDemo qs = new QuickSortDemo();
        int[] arr = {6,5,1,-3,2,-6,8,9,3};
        qs.printArr(arr, arr.length);
        //qs.partition(arr, 0, arr.length-1);

        qs.sort(arr, 0, arr.length-1);
        qs.printArr(arr, arr.length);


    }
}
