package sorting;

public class SelectionSortDemo {


    public void sort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]=temp;
        }
    }

    public void printArr(int[] arr, int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String [] args){

        SelectionSortDemo ss = new SelectionSortDemo();
        int[] arr1={7,9,5,4,1,2};
        int[] arr2={9,1,3,4,5,2};

        ss.sort(arr1,arr1.length);
        ss.sort(arr2,arr2.length);
        ss.printArr(arr1,arr1.length);
        ss.printArr(arr2,arr2.length);


    }

}
