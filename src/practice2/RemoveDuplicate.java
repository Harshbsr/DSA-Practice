package practice2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

    //Remove duplicates from a sorted array in place

    public static int[] removeDuplicate(int[] arr){

        HashSet<Integer> set = new LinkedHashSet<>();

        for(int i =0;i<arr.length;i++){

            set.add(arr[i]);

        }
        int index=0;
        int [] result = new int [set.size()];
        for(int i:  set){
            result[index]= i;
            index++;
        }

        return result;
    }
}
