package array;

public class SearchValueInSortedMatrix {

    public boolean isPresent(int[][] m,int n,int value){
        if(m.length==0){
            System.out.println("matrix is empty");
            return false;
        }
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            if(m[i][j]== value){
                System.out.println("value is found in matrix: "+value);
                return true;
            }
            if(m[i][j]>value){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("value is not found in matrix");
    return false;
    }


    public static void main(String[] args){
        int[][] matrix ={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,39,49},
            {32,33,43,50}
        };

        SearchValueInSortedMatrix obj = new SearchValueInSortedMatrix();
        obj.isPresent(matrix,4,29);
    }
}
