package array;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static int[] reverseArr2(int[] arr2){
        for(int i=0; i< arr2.length/2 ; i++){
            int temp= arr2[i];
            arr2[i]=arr2[arr2.length-1-i];
            arr2[i]=temp;
        }
        return arr2;
    }

    public static int[] reverseArr3(int[] arr3){
        int [] result = new int[arr3.length];
        for(int i=0; i< arr3.length ; i++){
           result[i] = arr3[arr3.length-1-i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8};
        reverseArr(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        reverseArr2(arr);
        System.out.println(Arrays.toString(arr));

        reverseArr3(arr);
        System.out.println(Arrays.toString(arr));
    }
}
