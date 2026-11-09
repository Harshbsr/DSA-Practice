package array;

import java.util.Arrays;

public class RemoveEvenNo {

    public static int[] removeEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] % 2 == 0)) {
                count++;
            }
        }
        int[] oddArr = new int[count];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] % 2 == 0)) {
                oddArr[j] = arr[i];
                j++;
            }
        }
       return oddArr;
        //System.out.println(oddArr);
    }
        public static void main(String args[]){
            int[] arr = {1, 2, 3, 4, 5, 6, 0, 8, 9};

            removeEven(arr);

            System.out.println(Arrays.toString(removeEven(arr)));

        }

}
