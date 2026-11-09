package practice2;

public class missingNo {

    //Find the missing number from 0 to N
//1 2 3 5 6 7


    public static int missingNo(int[] arr){
        int N = arr.length+1;
        int sum = (N *(N+1))/2;

        for(int num:arr){
            sum = sum-num;
        }

        return sum;

    }

}

