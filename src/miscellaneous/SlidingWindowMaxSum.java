package miscellaneous;
/*

Q. Given an array of integers arr, there is a sliding window of size k which is moving from the very left of the array to the very right. Find the maximum sum of any contiguous subarray of size k.

Example –

Input: arr = {2, 7, 3, 5, 8, 1}, k = 3
 Output: 16

Window Position	Sum[2 7 3] 5 8 1	12
2 [7 3 5] 8 1	15
2 7 [3 5 8] 1	16
2 7 3 [5 8 1]	14

Maximum Sum = 16 (from subarray [3, 5, 8])
 */
public class SlidingWindowMaxSum {

    public static int maxWindowSum(int[] arr, int k){
        if(arr== null|| k==0|| k>arr.length) {
            throw new IllegalArgumentException("Invalid Input");
        }
            int j=0;
            int windowSum=0;
            int maxSum=0;
            for(int i=0;i<arr.length;i++){
                windowSum = windowSum+arr[i];

                if(i>=k-1){
                    maxSum = Math.max(maxSum,windowSum);
                    windowSum = windowSum-arr[j];
                    j++;
                }
            }
            return maxSum;
        }

    public static int maxWindowSum2(int[] arr, int k){
        if(arr== null|| k==0|| k>arr.length) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int j=0;
        int windowSum=0;
        int maxSum=0;
        int i=0;
        while(k>i) {
            windowSum = windowSum + arr[i];
            i++;
        }
        maxSum = windowSum;// 12

         for(int l=i ; l<arr.length;l++) {
             windowSum = windowSum + arr[l]- arr[j];
             j++;
             maxSum = Math.max(maxSum, windowSum);
         }

        return maxSum;
    }






    public static void main(String[] args){
        System.out.println(maxWindowSum2(new int[]{2, 7, 3, 5, 8, 1},3));
        System.out.println(maxWindowSum2(new int[]{-2,-7,-3,-5,-8,-1},3));
    }
}
