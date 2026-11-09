package miscellaneous;
/*
Text from the image:

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Example 1:

Input: nums = [1,1,2]
 Output: 2, nums = [1,2,_]

Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
 Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */
public class RemoveDuplicatesFromSortedArray {

    public static int remove(int[] arr){
        if(arr.length==0){
            return 0;
        }

        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args){

        int[] numArr= new int[]{1,1,2};
        int[] numArr2= new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(numArr));
        System.out.println(remove(numArr2));

    }
}
