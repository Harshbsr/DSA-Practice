package sorting;

public class MergeSortDemo {

    public void sort(int arr[],int[] temp,int low,int high){
        if(low<high){
            int mid = low+(high-low)/2;// overflow condition(low+high)/2
            sort(arr,temp,low,mid);
            sort(arr,temp,mid+1,high);
            merge(arr,temp,low,mid,high);

        }

    }

    public void merge(int arr[],int[] temp,int low,int mid,int high){
        for(int i=low;i<=high;i++){
            temp[i]=arr[i];
        }
        int i=low;// traverse left subarray
        int j=mid+1;// traverse right subarray
        int k=low; // will merge both arrays to original arr
        while(i <=mid && j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }

        while(i <=mid){
                arr[k]=temp[i];
                i++;
                k++;

        }

    }

    public void printArr(int[] arr, int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        MergeSortDemo ms = new MergeSortDemo();
        int[] arr1={7,9,5,4,1,2};
        ms.printArr(arr1,arr1.length);
        ms.sort(arr1,new int[arr1.length],0,arr1.length-1);
        ms.printArr(arr1,arr1.length);
        int[] arr2={9,1,3,4,5,2};
        ms.printArr(arr2,arr2.length);
        ms.sort(arr2,new int[arr2.length],0,arr2.length-1);
        ms.printArr(arr2,arr2.length);
    }
}
