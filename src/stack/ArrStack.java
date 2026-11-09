package stack;

public class ArrStack {

    private int top;
    private int[] arr;

    public ArrStack(int value) {
        top = -1;
        arr = new int[value];
    }

    public boolean isFull() {
        return arr.length == size();
    }

    public int size() {
        return top + 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = value;
        }
    }

    public int pop(){
        int result=0;
        if(top<0){
            System.out.println("Stack is Empty.Cannot pop");
        }else{
             result= arr[top];
            top--;
        }
        return result;
    }

    public int peak(){
        if(top<0){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public static  void main(String [] args){
        ArrStack stack = new ArrStack(3);
        stack.pop();
        System.out.println(stack.peak());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peak());

    }
}

