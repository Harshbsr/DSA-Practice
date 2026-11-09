package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
0---------1

3---------2-----4

 */
public class UndirectedGraphLinkListDemo {
    LinkedList<Integer>[] adjList;
    int V;// no of vertices
    int E;//no of edges

    UndirectedGraphLinkListDemo(int nodes){
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
/*
Breadth Search First Search
we also called it Level Order Traversal
for this example at
level 1 that is for 0
level2 1 and 3
level3 2
level4 4

 */
    public void bfs(int s){
        boolean[] isVisited = new boolean[V];
        Queue<Integer> q= new LinkedList<>();
        isVisited[s]= true;
        q.offer(s);
        while(!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");

            for(int x:adjList[u]){
                if(!isVisited[x]) {
                    isVisited[x] = true;
                    q.offer(x);
                }
            }

        }

    }

    public void dfs(int s){
         boolean[] isVisited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        st.push(s);
        while(!st.isEmpty()) {
            int u = st.pop();
            if (!isVisited[u]) {
                isVisited[u] = true;
                System.out.print(u + " ");
                for (int x : adjList[u]) {
                    if (!isVisited[x]) {
                        st.push(x);
                    }
                }
            }
        }

    }

    public static void main(String[] args){
        UndirectedGraphLinkListDemo g = new UndirectedGraphLinkListDemo(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);

        System.out.println(g);
        g.bfs(0);
        System.out.println("");
        g.dfs(0);

    }
}
