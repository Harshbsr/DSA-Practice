package array;

public class MinValueArr {

    public static int minValue(int[] arr) {
        int min =  arr [0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                    min =  arr[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max =  arr [0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max =  arr[i];
            }
        }
        return max;
    }

    public static void  main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 0, 8, 9};
        minValue(arr);
        System.out.println(minValue(arr));

        maxValue(arr);
        System.out.println(maxValue(arr));
    }
}

