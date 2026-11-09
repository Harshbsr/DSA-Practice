package sorting;

public class BubbleSortDemo {

    public static void sortArr(int[] arr, int n){
        for(int i=0; i<n-1;i++){
            boolean isSwap = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwap = true;
                }
            }
            if(isSwap==false){
                break;
            }
        }
    }

    public static void printArr(int[] arr, int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String [] args){

        BubbleSortDemo bs = new BubbleSortDemo();
        int[] arr1={7,9,5,4,1,2};
        int[] arr2={1,9,3,4,5,2};

        bs.sortArr(arr1,arr1.length);
        bs.sortArr(arr2,arr2.length);
        bs.printArr(arr1,arr1.length);
        bs.printArr(arr2,arr2.length);

    }
}
