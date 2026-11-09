package array;
/*
Q. Given sorted array of integers,rearrange array in such a way that the first position will have the largest number
, the second will have the smallest, the third will have the second-largest,
and so on. Using O(1) extra space.

Example -

Input: arr = {1, 2, 3, 4, 5, 6, 7}

Output: arr = {7, 1, 6, 2, 5, 3, 4}

 */

// this method has space complexity of O(n) and time complexity of O(n)
public class RearrangeArr {

    public int[] reArrange(int [] arr){
        int n = arr.length;
        int k=0;
        int i=0;//0
        int j=n-1;//3
        int [] result = new int[n];
        while(i!=j){
            result[k]=arr[j];
            if(k==n-1){
                break;
            }
            k++;
            result[k]=arr[i];
            if(k==n-1){
                break;
            }
            k++;//2
            i++;//1
            j--;//2
        }
        result[k]= arr[i];
        return result;
    }
    // this method has space complexity of O(1) and time complexity of O(1)

    public void reArrangeArr2(int[] arr){
        int maxIndex= arr.length-1;
        int minIndex=0;
        int max=arr[maxIndex]+1;

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]= arr[i]+(arr[maxIndex]%max)*max;
                maxIndex--;
            }else{
                arr[i]= arr[i]+(arr[minIndex]%max)*max;
                minIndex++;
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/max;
        }

    }


    public void print(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static  void main(String[] args){
        RearrangeArr ra = new RearrangeArr();
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int [] arr2 = {10, 11, 13, 14};
        ra.print(arr,arr.length);
        ra.reArrangeArr2(arr);
        ra.print(arr,arr.length);

        ra.print(arr2,arr2.length);
        ra.reArrangeArr2(arr2);
        ra.print(arr2,arr2.length);
    }
}
