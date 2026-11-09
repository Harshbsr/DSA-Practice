package graph;

import java.util.LinkedList;
import java.util.Stack;

public class DfsUnidirectionalRecursiveGraph {


    /*
0---------1

3---------2 ----4

5 - not linked to any node

 */

    LinkedList<Integer>[] adjList;
    int V;// no of vertices
    int E;//no of edges

    DfsUnidirectionalRecursiveGraph(int nodes){
        V=nodes;
        E=0;
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


    public void dfs(int s) {
        boolean[] isVisited = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!isVisited[v]) {
                dfs(v, isVisited);
            }
        }

    }

    public void dfs(int u,boolean[] isVisited) {
        isVisited[u] = true;
        System.out.print(u+" ");
        for(int x: adjList[u]){
            if(!isVisited[x]){
                dfs(x,isVisited);
            }
        }

    }


    public static void main(String[] args){
        DfsUnidirectionalRecursiveGraph g = new DfsUnidirectionalRecursiveGraph(6);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);
        g.addEdge(5);
        System.out.println(g);

        g.dfs(0);



    }

}
