package searching;

public class LinearSearchArr {


    public  static int  search(int [] arr, int n,int x){
        if (n==0){
            System.out.println("array is empty");
            return -1;
        }

        for(int i=0;i<n;i++){
            if(arr[i] == x){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args){

        int [] arr1 ={1,4,8,9,7};

        System.out.println(search(arr1,arr1.length,9));
        System.out.println(search(arr1,arr1.length,80));



    }
}
