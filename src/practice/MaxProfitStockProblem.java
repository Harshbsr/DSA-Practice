package practice;

/*
Problem 4 — Best Time to Buy and Sell Stock

Given an array prices where:

prices[i] = price of the stock on day i

You can buy the stock once and sell it once.

The selling day must be after the buying day.

Return the maximum profit you can achieve.

If no profit is possible, return 0

Example 1
Input:
prices = [7, 1, 5, 3, 6, 4]

Output:
5

Example 2
Input:
prices = [7, 6, 4, 3, 1]

Output:
0
 */
public class MaxProfitStockProblem {

    public static int maxProfitStockProblem(int[] arr){
        if(arr==null || arr.length<2){
            throw new IllegalArgumentException("Invalid Input");
        }
        //prices = [7, 1, 5, 3, 6, 4]
        // [2, 10, 1, 3]
        // [7, 6, 4, 3, 1]
        Integer buy = Integer.MAX_VALUE;
        Integer maxProfit= 0;
        for(int i = 0; i< arr.length;i++){

            buy = Math.min(buy,arr[i]);
            int profit= arr[i]-buy;
            maxProfit= Math.max(maxProfit,profit);

    }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {7, 6, 4, 3, 1};
        int[]  arr3={2, 10, 1, 3};
        System.out.println(maxProfitStockProblem(arr));
        System.out.println(maxProfitStockProblem(arr2));
        System.out.println(maxProfitStockProblem(arr3));
    }
}
