package sorting;

public class InsertionSortDemo {

    public void sort(int[] arr,int n){
        for(int i=1;i<n;i++){// sorted part
            int temp=arr[i];// unsorted part
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];// shift larger value to temp by one position
                j=j-1;
            }

            arr[j+1]= temp;
        }
    }

    public void printArr(int[] arr, int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String [] args){

        InsertionSortDemo bs = new InsertionSortDemo();
        int[] arr1={7,9,5,4,1,2};
        int[] arr2={9,1,3,4,5,2};

        bs.sort(arr1,arr1.length);
        bs.sort(arr2,arr2.length);
        bs.printArr(arr1,arr1.length);
        bs.printArr(arr2,arr2.length);


    }
}
