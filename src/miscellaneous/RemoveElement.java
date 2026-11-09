package miscellaneous;
/*
Q. Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed.
Then return the number of elements in nums that are not equal to val.

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]


Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]


Here, _ represents values that do not matter after the first k valid elements.
 */
public class RemoveElement {


    public static  int remove(int[] num, int value){

        int i=0;
        for(int j=0;j<num.length;j++){
            if(num[j]!=value){
                num[i]=num[j];
                i++;
            }
        }

        return i;
    }
    public static void main(String[] args ){
       int[] numArr= new int[]{3,2,2,3};
        int[] numArr2= new int[]{0,1,2,2,3,0,4,2};
        System.out.println(remove(numArr,3));
        System.out.println(remove(numArr2,2));



    }
}
