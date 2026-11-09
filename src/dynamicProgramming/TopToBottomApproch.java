package dynamicProgramming;

public class TopToBottomApproch {

    public int fib(int[] arr, int n ){
        if(arr[n]==0){
            if(n<2){
                arr[n]=n;
            } else{
                int left = fib(arr,n-1);
                int right= fib(arr,n-2);
                arr[n]= left+right;
            }
        }
        return arr[n];
    }

    public void print(int [] arr){
        for(int value: arr){
            System.out.print(value+" ");
        }
    }
    public static void main(String[] args){
        TopToBottomApproch tb = new TopToBottomApproch();
        int [] result = new int[6];
        tb.fib(result,5);
        tb.print(result);

    }



}
