package practice;
/*
Problem

Given an integer array nums, move all 0s to the end of the array while maintaining the relative order of the non-zero elements.
You must modify the array in-place.

Example 1
Input:
[0, 1, 0, 3, 12]

Output:
[1, 3, 12, 0, 0]
 */
public class MoveZeroToEnd {

    public static int[] moveZeroesToEnd(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int j = arr.length - 1;
        int k = 0;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result[j] = 0;
                j--;
            } else {
                result[k] = arr[i];
                k++;
            }
        }

        return result;
    }
// as above solution auxiliary space is O(n) but we can reduce it to O(1) by using the result array to store the left product and then multiply it with the right product in the second loop.

    public static void moveZeroesToEnd2(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int k=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i]= arr[k];
                arr[k]=temp;
                k++;
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 3, 12};
        moveZeroesToEnd2(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

/*
"I use two pointers. i traverses the array, while k represents the position where the next non-zero element should be placed. Whenever I find a non-zero element, I swap it with the element at k and increment k. This keeps all non-zero elements in their original relative order and moves zeroes to the end.
 */