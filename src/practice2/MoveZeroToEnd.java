package practice2;

public class MoveZeroToEnd {

    //Move all zeros to the end
  //
    public static void moveZeroToEnd(int[] arr){
        int k=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                if(i!=k) {// if i and k are not same then only swap
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
                k++;
            }
        }

    }
}
