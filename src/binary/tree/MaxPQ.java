package binary.tree;

public class MaxPQ {
// maximum priority queue
    Integer[] heap;
    int n;

    public MaxPQ(int capacity){
        heap = new Integer[capacity+1];
        n=0;
    }

    public int size(){
        return  n;
    }


    public void insert( int x){

        if(n== heap.length-1){
            resize(2* heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);

    }

    private void swim(int k){
        while(k>1&& heap[k/2]< heap[k]){
            int temp = heap[k];
            heap[k]=heap[k/2];
            heap[k/2]= temp;
            k=k/2;
        }

    }

    private void resize(int s){
        Integer[] temp = new Integer[s];
        for(int i= 1; i<=n; i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public void printMaxPQ(){
        for(int i=1;i<=n;i++){
            System.out.print(heap[i]+" ");
        }
    }

    public int maxDelete(){
        int max = heap[1];
         swap(1,n);
         n--;
         sink(1);
         heap[n+1]=null;
         if(n>0 &&(n==(heap.length *2)/4)){
             resize(2* heap.length);
         }

         return max;
    }
    private void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b]= temp;
    }
    private void sink(int k){
        while(2*k<=n) {
            int j = 2 * k;
            if (j < n && heap[j] < heap[j + 1]) {
             j++;
            }
            if( heap[k]>=heap[j]){
                break;
            }
            swap(k,j);
            k=j;
        }
    }
    public static void main(String[] args){
        MaxPQ pq= new MaxPQ(3);

        System.out.println( pq.isEmpty());
        pq.insert(5);
        pq.insert(4);
        pq.insert(6);
        pq.insert(4);
        pq.insert(3);
        pq.printMaxPQ();
        System.out.println( pq.size());
        System.out.println(pq.maxDelete());
        pq.printMaxPQ();
    }
}
