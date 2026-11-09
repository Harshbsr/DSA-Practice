package practice;
/*
Given an integer array height, where height[i] represents the height of a vertical line at index i.

Choose two different lines such that, together with the x-axis, they form a container that holds the maximum amount of water.

Return the maximum amount of water the container can store.

Example
Input:
height = [1,8,6,2,5,4,8,3,7]


Output:
49
height = min(arr[left], arr[right])
width  = right - left
area   = height × width
 */
public class ContainerWithMostWater {

    public static int maxAreaForWater(int[] arr){
        if(arr==null){
            return 0;
        }
        int left=0;
        int right= arr.length-1;
        int maxArea = 0;
        while(left<right){
            int height = Math.min(arr[left],arr[right]);
            int width = right-left;
            int area = height * width;
            maxArea = Math.max(area,maxArea);
            if(arr[left]>arr[right]){
                right--;
            }else {
                left++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        System.out.println(maxAreaForWater(new int []{1,8,6,2,5,4,8,3,7}));
    }

}
/*
Interview explanation

If asked "Why do you move the shorter pointer?", say:

"The shorter height limits the amount of water. Moving the taller pointer only reduces the width while the limiting height remains unchanged, so I move the shorter pointer to potentially find a taller line."
 */