package miscellaneous;

import java.util.ArrayList;
import java.util.List;

/*
Text from the image:

Q. Given an array of integers arr[], return an array result[] such that result[i] is equal to the product of all the elements of arr except arr[i]. The product fits in a 32-bit integer. The algorithm should run in O(n) time and without using the division operator.

Example

Input: arr = {1, 2, 3, 4}
 Output: result = {24, 12, 8, 6}

Input: arr = {-1, 1, 0, -3, 3}
 Output: result = {0, 0, 9, 0, 0}
 */
public class ProductOfArrExceptSelf {

    public static int [] product(int[] arr){
         int[] result = new int[arr.length];

        int i=0;
        while(i!=arr.length) {
            int product=1;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                product = product * arr[j];
            }
            result[i]=product;
            i++;
        }

        return result;
    }
  public static int[] findProduct(int[] arr){ // 4 2 5 4
        int[] result = new int[arr.length];
        int temp=1;
        for(int i=0;i<arr.length;i++){
            result[i]=  temp;
            temp= temp *arr[i];
        }
        // 1 4 8 40
        temp=1;
      for(int j= arr.length-1;j>=0;j--){
          result[j] = result[j]*temp;
          temp= temp* arr[j];
      }
     return result;
  }
    public static void main(String[] args) {
        int[] result = new int[4] ;
        result=findProduct(new int[]{1, 2, 3, 4});

        int[] result2 = new int[6] ;
        result2=findProduct(new int[]{1,-1, 1, 0, -3, 3});

        for(int i: result){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i: result2){
            System.out.print(i+" ");
        }

    }
}
