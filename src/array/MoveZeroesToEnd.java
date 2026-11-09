package array;

import java.util.Arrays;

public class MoveZeroesToEnd {

    public static int [] moveZeroesToEnd(int[] arr){

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(!(arr[j]==0)){
                j++;
            }

        }
     return arr;
    }

    public static void main(String args[]){
        int [] arr={ 5,7,8,0,0,7,8,0,6,8,0};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(moveZeroesToEnd(arr)));
        ;
    }
}

