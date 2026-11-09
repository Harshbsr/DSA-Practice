package array;

import sorting.BubbleSortDemo;

import java.util.Arrays;

public class SquareOfSortedArray {

    // will take O(n Log n)
    public void squareSortArr(int[] arr,int n){
        for(int i=0;i<n;i++){
            int x = arr[i];
            arr[i]=x*x;
        }
        Arrays.sort(arr);

    }
// will take O(n)

     public int[]  sort(int[] arr){
        int n= arr.length;
        int[] result= new int[n];
        int i=0; int j=n-1;
        for(int k =n-1; k>=0;k--){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                result[k]= arr[i] * arr[i];
                i++;
            }else{
                result[k]= arr[j] * arr[j];
                j--;
            }
        }
       return result;
     }
    public static void printArr(int[] arr, int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        SquareOfSortedArray sa = new SquareOfSortedArray();

        int[] arr ={-4,-1,0,3,10};
//         printArr(arr,arr.length);
//        sa.squareSortArr(arr, arr.length);
//        printArr(arr,arr.length);

        printArr(arr,arr.length);
        int[] result=sa.sort(arr);
        printArr(result,result.length);




    }
}