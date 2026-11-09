package sorting;
/*
Sort an array of 0’s, 1’s, and 2’s (Dutch National Flag Problem)
 */
public class DutchSortingProblem {


    public void sort(int[] arr) {

        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                if (arr[i] == 2) {
                    swap(arr, i, k);
                    k--;
                }

            }
        }

    }



    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public void printArr(int[] arr, int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){

        DutchSortingProblem ds = new DutchSortingProblem();

        int[] arr1={0,1,2,0,1,2,0,1,2};
        ds.printArr(arr1,arr1.length);
        ds.sort(arr1);
        ds.printArr(arr1,arr1.length);


    }
}
