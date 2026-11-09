package array;

public class MissingNoInArr {

    public static int MissingNoInArr(int[] arr,int n){
        //int n= arr.length+1;
        int sum = (n*(n+1))/2;
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result=result+arr[i];
        }
 return sum- result;
    }


    public static void main(String args[]){
        int [] arr={1,2,3,4,5,7};
        MissingNoInArr(arr, 7);
        System.out.println(MissingNoInArr(arr, 7));
    }
}
