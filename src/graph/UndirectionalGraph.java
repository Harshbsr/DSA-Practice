package graph;

import java.util.LinkedList;

public class UndirectionalGraph {



    /*
1-----0-----3 these three are linked independently

2 ----4 these two are linked independently

5 - not linked to any node(alone)

these problem we will  check whether nodes are connected or not
 eg 1 and 2 these are not connected

 */

    LinkedList<Integer>[] adjList;
    int V;// no of vertices
    int E;//no of edges
    int[] countId;

    UndirectionalGraph(int nodes){
        V=nodes;
        E=0;
        countId= new int[nodes];
        this.adjList = new LinkedList[nodes];
        for(int i=0;i<V;i++){
            this.adjList[i]= new LinkedList<>();
        }

    }

    public void addEdge(int x,int y){
        this.adjList[x].add(y);
        this.adjList[y].add(x);
        E++;
    }

    public void addEdge(int x){
        this.adjList[x].add(x);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+":vertices "+E+":edges"+"\n");
        for(int i = 0;i<V;i++){
            sb.append(i+": ");
            for(int j:adjList[i]){
                sb.append(j+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public void dfs() {
        boolean[] isVisited = new boolean[V];
        int count=0;
        for (int v = 0; v < V; v++) {
            if (!isVisited[v]) {
                dfs(v, isVisited,count);
                count++;
            }
        }
    }

    public void dfs(int u,boolean[] isVisited,int count) {
        isVisited[u] = true;
        countId[u]=count;
        System.out.print(u+" ");
        for(int x: adjList[u]){
            if(!isVisited[x]){
                dfs(x,isVisited,count);
            }
        }

    }

    public boolean isConnected(int x, int y){
        return (countId[x]== countId[y]);
    }


    public static void main(String[] args){
        UndirectionalGraph g = new UndirectionalGraph(6);
        g.addEdge(0,1);;
        g.addEdge(0,3);
        g.addEdge(2,4);
        g.addEdge(5);
        System.out.println(g);

        g.dfs();
        System.out.println("\ncountId array:");
        for(int i:g.countId){
            System.out.print(i+" ");
        };
        System.out.println("\n"+g.isConnected(1,5));// false
        System.out.println(g.isConnected(2,0));// false
        System.out.println(g.isConnected(1,0));// true

    }
}
