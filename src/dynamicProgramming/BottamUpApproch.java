package dynamicProgramming;

public class BottamUpApproch {

    public int [] fib(int n){
        int[] table = new int[n+1];
        table[0]=0;
        table[1]=1;
        for(int i=2;i<=n;i++){
            table[i]= table[i-1]+table[i-2];
        }
        return table;
    }

    public void print(int [] arr){
        for(int value: arr){
            System.out.print(value+" ");
        }
    }
    public static void main(String[] args){
        BottamUpApproch bu = new BottamUpApproch();
        bu.print(bu.fib(5));

    }
}
