package linkList;


public class CircularLinkList {

    private Node last;
    private int length;

    private static class Node{
        // parameter of link list
        private int data; // generic type
        private Node next;// represent the address of next node

        public Node(int data){
            this.data=data;
        }

    }

    public CircularLinkList(){
        last=null;
        length=0;
    }

    public int length(){
        return  length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void createCircularLinkList(){
        Node first = new Node(6);
        Node second = new Node(7);
        Node third = new Node(8);
        Node fourth= new Node(9);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        last=fourth;
        length=4;
    }

    public void display(){
        if(isEmpty()){
            return;
        }
        Node first = last.next;

        while(first!=last){
            System.out.print(first.data+" --> ");
            first=first.next;
        }
        System.out.print(first.data);
    }

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            last= newNode;
            last.next=newNode;
        }else{
        newNode.next=last.next;
        last.next=newNode;
        }
         length++;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            last= newNode;
            last.next=newNode;
        }else{
            newNode.next=last.next; // point new node to first node
            last.next=newNode;      // old last points to new node
            last=newNode;           // update last to new node
        }
        length++;
    }

    public void deleteAtFirst(int pos){
        if(isEmpty()){
            return;
        }
        Node temp= last.next;
        if(pos==1){
            if(temp==last){
                last=null;
            }else {
                last.next = last.next.next;
            }
        }
    }
    public static void main(String args[]){

        CircularLinkList cll = new CircularLinkList();
        cll.createCircularLinkList();
        cll.display();
        cll.insertAtFirst(5);
        System.out.println("");
        System.out.println("CircularLinkList after inserting at first: ");
        cll.display();

        cll.insertAtFirst(10);
        System.out.println("");
        System.out.println("CircularLinkList after inserting at first: ");
        cll.display();

        cll.insertAtEnd(22);
        System.out.println("");
        System.out.println("CircularLinkList after inserting at End: ");
        cll.display();

        cll.deleteAtFirst(1);
        System.out.println("");
        System.out.println("CircularLinkList after deleting  at first: ");
        cll.display();

    }
}
