package stack;

public class Stack {

    private Node top;
    private int length;

    private class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }

    }

    public Stack(){
        top=null;
        length=0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

   public void push(int value){
        Node newNode= new Node(value);
        if(isEmpty()){
            top = newNode;
        }else{
            newNode.next=top;
            top = newNode;
        }

        length++;
   }

    public int pull(){
        int result;
        if(isEmpty()){
            return 0;
        }else{
             result=top.data;
              top= top.next;
            length--;
        }
        return result;
    }

    public int peak(){// peak represent the first value of stack
        if(isEmpty()){
            return 0;
        }else{
            return top.data;
        }
    }

    public static void main(String[] args){
      Stack stack = new Stack();
      stack.push(10);
      stack.push(20);
      stack.push(30);

      System.out.println(stack.peak());
      stack.pull();
      System.out.println(stack.peak());
      stack.pull();
      System.out.println(stack.peak());




    }

}
