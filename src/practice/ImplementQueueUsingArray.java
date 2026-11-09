package practice;
/*
Implement a Circular Queue

Implement a queue using an array with fixed capacity k.

Support:

enqueue(int x)
dequeue()
peek()
isEmpty()
isFull()

Example with capacity 3:

enqueue(10)
enqueue(20)
enqueue(30)
dequeue() → 10
enqueue(40)
peek() → 20

 */
public class ImplementQueueUsingArray {

    static int[] arr = new int[5];
    static int size=0;
    static int rear =0;
    static int front =0;

    static void enqueue(int k){
        if(!isFull()) {
            arr[rear] = k;
            rear = (rear +1 )% arr.length;
            size++;
        }

    }

    static int dequeue() {
        if(isEmpty()){
            return -1;
        }
       int deletedValue =arr[front];
        front = (front +1 )% arr.length;
        size--;
       return deletedValue;
    }
static int peek(){
        return arr[front];
}
 static boolean isEmpty(){
        return size==0;
 }

    static boolean isFull(){
        return size==arr.length;
    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        peek();
        dequeue();
        peek();
    }
}
