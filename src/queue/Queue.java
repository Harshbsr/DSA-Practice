package queue;

import java.util.NoSuchElementException;

public class Queue {

    private Node rear;
    private Node front;
    private int length;

    public Queue(){
        this.rear=null;
        this.front=null;
        this.length=0;

    }

    private class Node{
        private Node next;
        private int data;

        public Node(int data){
            this.data =data;
            this.next=null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length()==0;
    }

    public void enqueue(int value){
      Node newNode = new Node(value);
      if(isEmpty()){
          front = rear = newNode;
      }else{
          rear.next= newNode;
          rear= newNode;
      }
        length++;
    }

    public void print(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp= temp.next;
        }

        System.out.print("null");
    }

    public void dequeue(){

        if(isEmpty()){
            return;
        }
        if(length==1){
            front=null;
            rear=null;
            }else{
            front = front.next;
        }
        length--;
    }

    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already Empty");
        }
         return front.data;
    }

    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already Empty");
        }
        return rear.data;
    }
    public static void main(String [] args){
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        System.out.println("");
        System.out.println(queue.first());
        System.out.println(queue.last());
        queue.dequeue();
        queue.print();
        queue.dequeue();
        System.out.println("");
        queue.print();
        queue.dequeue();
        System.out.println("");
        queue.print();

    }
}
