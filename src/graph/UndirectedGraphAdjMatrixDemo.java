package graph;

/*
0---------1

3---------2------4

 */
public class UndirectedGraphAdjMatrixDemo {
    int v;// no of vertices in a graph
    int e;// no of edges in a graph
    int[][] adjMatrix;

    UndirectedGraphAdjMatrixDemo(int n){
        v=n;
        e=0;
        adjMatrix = new int[n][n];
    }

    public void addEdge(int x,int y){
        this.adjMatrix[x][y]=1;
        this.adjMatrix[y][x]=1;
        e++;

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(v+":vertices "+e+":edges"+"\n");
        for(int i = 0;i<v;i++){
            sb.append(i+": ");
            for(int j:adjMatrix[i]){
                sb.append(j+" ");
            }
            sb.append("\n");
        }
      return sb.toString();
    }
    public static void main(String[] args){
        UndirectedGraphAdjMatrixDemo g = new UndirectedGraphAdjMatrixDemo(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);

       System.out.println(g);

    }
}
