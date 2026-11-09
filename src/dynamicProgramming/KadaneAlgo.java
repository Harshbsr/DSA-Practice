package dynamicProgramming;

public class KadaneAlgo {


    public static int subArrSum(int[] subArr){
        int currentMax= subArr[0];
        int maxSum= subArr[0];
        for(int i=1;i<subArr.length;i++){
            currentMax = currentMax+subArr[i];
            if(currentMax<subArr[i]){
                currentMax=subArr[i];
            }
            if(maxSum<currentMax){
                maxSum=currentMax;
            }
        }
        return maxSum;
    }


    public static void main(String[] args){

        int [] arr ={4,3,-2,6,-12,7,-1,6};
        int [] arr2={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum sub array sum is: "+subArrSum(arr2));
    }
}
