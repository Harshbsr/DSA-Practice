package practice2;

public class SortedArr {

    //Check whether an array is sorted
    public static boolean sortedArr(int[] arr){

        for(int i=1; i<arr.length;i++){

            if(arr[i]<arr[i-1]){
                return false;
            }

        }

        return true;
    }
}
