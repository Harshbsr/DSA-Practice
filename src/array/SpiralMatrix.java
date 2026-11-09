package array;

public class SpiralMatrix {

    public void printSpiralMatrix(int[][] m,int r,int c){
        int k=0,l=0;
        while(k<r&& l<c){
            // Print top row (left to right)
            for(int i=l;i<c;i++){
                System.out.print(m[k][i]+" ");
            }
            k++;
            // Print right column (top to bottom)
            for(int i =k; i<r;i++){
                System.out.print(m[i][c-1]+" ");
            }
            c--;
            // Print bottom row (right to left)
            if(k<r){
                for(int i =c-1; i>=l; i--){
                    System.out.print(m[r-1][i]+" ");
                }
                r--;
            }
            // Print left column (bottom to top)
            if(l<c){
                for(int i =r-1; i>=k; i--){
                    System.out.print(m[i][l]+" ");
                }
                l++;
            }
        }

    }
    public static void main(String args[]){

        int[][] matrix ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        SpiralMatrix obj = new SpiralMatrix();
        obj.printSpiralMatrix(matrix,4,4);

    }
}
