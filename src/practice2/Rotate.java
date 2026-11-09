package practice2;

public class Rotate {

/*
    Rotate an array by K positions

    arr = [1, 2, 3, 4, 5, 6, 7]
    k = 3
            [4, 5, 6, 7, 1, 2, 3]
    Output:
            [5, 6, 7, 1, 2, 3, 4]

 */

    public static int[] rotatetoRight(int[] arr, int k){

        int [] result = new int[arr.length];
        int j=0;
        k=k%arr.length;
        for(int i= arr.length-k;i<arr.length;i++){

            result[j]=arr[i];
            j++;

        }

        for(int i= 0;i<arr.length-k;i++){

            result[j]=arr[i];
            j++;
        }

        return result;

    }

    public static int[] rotatetoLeft(int[] arr, int k){

        int [] result = new int[arr.length];
        int j=0;
        k=k%arr.length;
        for(int i= k;i<arr.length;i++){

            result[j]=arr[i];
            j++;

        }

        for(int i= 0;i<k;i++){

            result[j]=arr[i];
            j++;
        }

        return result;

    }

    public static  void rotate(int[] arr,int k) {

        k = k % arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

        public static void reverse(int[] arr, int left, int right){
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }

