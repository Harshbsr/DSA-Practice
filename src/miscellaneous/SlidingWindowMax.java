package miscellaneous;

import java.util.*;

/*
Text from the image:

Q. Given an array of integers arr, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 Return the max sliding window.

Example –

Input: arr = {44, 77, 33, 44, 88, 11}, k = 3

Output: arr = [77, 77, 88, 88]
 */
public class SlidingWindowMax {

    public static List<Integer> windowMaxValue(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<=arr.length-k){
           int max = arr[i];
           for(int j=i;j<=i+k-1;j++){
               if(max<arr[j]){
                   max = arr[j];
               }
           }
           i++;
           list.add(max);
       }
        return list;
    }


     public static List<Integer> windowMaxValue2(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        int [] indexArr= getNextMaxGreaterValue(arr);
        for(int i=0;i<=arr.length-k;i++){
            int j=i;
            while(indexArr[j]<i+k){
                j=indexArr[j];
            }

            list.add(arr[j]);
        }

         return list;
     }

     public static int[] getNextMaxGreaterValue(int [] arr){
        int [] result = new int[arr.length];
         Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                    stack.pop();
                }
            }

            if(stack.isEmpty()){
                result[i]= arr.length;
            }else{
                result[i]= stack.peek();
            }
            stack.push(i);
        }
       return result ;
     }

     public static List<Integer> windowMaxValue3(int [] arr,int k){
        if(arr.length==0|| k>arr.length|| k==0){
            throw  new IllegalArgumentException("Invalid input");
        }
        List<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);


            if(i>=k-1){
                list.add(arr[deque.peekFirst()]);
            }
        }
        return list;
     }
    public static void main(String[] args){
            System.out.println(windowMaxValue2(new int[]{44, 77, 33, 44, 88, 11},3));
        System.out.println(windowMaxValue2(new int[]{44, 77, 33, 44, 88, 11},4));
    }
}
