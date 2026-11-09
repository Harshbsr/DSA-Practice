package array;
/*
Merge Two Sorted Array and there resultant also should be in sorted order
 */
public class MergeTwoSortedArr {

    public int[] sort(int[] arr1, int[] arr2, int n1, int n2) {

        int k = 0;// for result
        int[] result = new int[n1 + n2];
        int i = 0;// for arr1
        int j = 0;// for arr2
            while (i <n1 && j<n2) {
                if (arr1[i] < arr2[j]) {
                    result[k] = arr1[i];
                    i++;
                } else {
                    result[k] = arr2[j];
                    j++;
                }
                k++;
            }

            while(i<n1){
                result[k] = arr1[i];
                i++;
                k++;
            }

        while(j<n2){
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public void print(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        MergeTwoSortedArr obj = new MergeTwoSortedArr();

        int[] arr1 ={1,5,8,9,10};
        int[] arr2 ={2,3,6,7,11,12};
        obj.print(arr1,arr1.length);
        obj.print(arr2,arr2.length);
        int[] result = obj.sort(arr1,arr2,arr1.length,arr2.length);
        obj.print(result,result.length);
    }

}
