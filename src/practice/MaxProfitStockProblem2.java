package practice;
/*
Given an array prices, where prices[i] is the stock price on day i, find the maximum profit you can achieve.

You may complete as many transactions as you like, but:

You must sell your stock before buying again.

Example 1
Input:
[7, 1, 5, 3, 6, 4]


Output:
7
 */
public class MaxProfitStockProblem2 {

   public static int  MaxProfitStockProblem2(int[] arr){
       int profit=0;
       for(int i=1;i<arr.length;i++){
           if(arr[i]>arr[i-1]){
               profit=profit+(arr[i]-arr[i-1]);
           }
       }
       return profit;
   }

       public static void main(String[] args){
           int[] arr = {7, 1, 5, 3, 6, 4};

           System.out.println(MaxProfitStockProblem2(arr));
       }
}
/*
Because multiple transactions are allowed, every positive consecutive price difference contributes to the maximum profit. Summing all positive differences is equivalent to buying at each local minimum and selling at the following local maximum
 */

