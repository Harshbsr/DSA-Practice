package linkList;

public class DoublyLinkList {

    private Node head;
    private Node tail;
    private int length;

    private static class Node{
        // parameter of link list
        private int data; // generic type
        private Node previous;// represent the address of next node
        private Node next;// represent the address of next node

        public Node(int data){
            this.data=data;
        }

    }

    public DoublyLinkList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int length(){
        return length;
    }
    public void insertAtLast(int value){
      Node newNode = new Node(value);
      if(isEmpty()){
          head = newNode;
      }else{
          tail.next = newNode;
      }
        newNode.previous = tail;
         tail = newNode;
        length++;
    }

    public void displayForward(){
        if(head==null){
            return;
        }
        Node temp = head;
        while( temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackword(){
        if(tail==null){
            return;
        }
        Node temp = tail;
        while( temp!=null){
            System.out.print(temp.data+"<--");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertAtNthNode( int pos, int value){
      Node newNode = new Node(value);
      if(pos==1){
          if(head==null){
              head=newNode;
              tail=newNode;  // FIX: Update tail for empty list
          }else{
              newNode.next= head;
              head.previous=newNode;
              head=newNode;
          }
        length++;
          return;
      }
        //8<-->6<-->3<-->1<-->null
      Node temp= head;
      Node tempPr=null;
      int count=1;
      while(count<pos && temp!=null){
          tempPr= temp;
          temp=temp.next;
          count++;
      }
      if(temp==null){
          System.out.println("out of list length");
          return;
      }
        temp.previous= newNode;
        newNode.next=temp;
        newNode.previous=tempPr;
        if(tempPr!=null){
            tempPr.next=newNode;
        }
        length++;
    }

    public void deleteNthNode(int pos){
        if(isEmpty()){
            return;
        }
        if(pos==1){
            if(head==tail){
                tail=null;
                head=null;
            }else {
                head = head.next;
            }
            length--;
        }
        //8<-->6<-->3<-->1<-->null
        Node temp =head;
        int count=1;
        while(count<pos & temp!=null){
            temp= temp.next;
            count++;
        }
            if(temp.next!=null){
                temp.previous.next= temp.next;
                temp.next.previous=temp.previous;
            } else{
                temp.previous.next=null;
                tail=temp.previous;
            }
         length--;

    }

    public static void main(String[] args){
        DoublyLinkList dl1 = new DoublyLinkList();
        dl1.insertAtLast(1);
        dl1.insertAtLast(3);
        dl1.insertAtLast(6);
        dl1.insertAtLast(8);
        System.out.println("displayForward: ");
        dl1.displayForward();
        System.out.println("displayBackword: ");
        dl1.displayBackword();

        System.out.println("insertAtNthNode : ");
        dl1.insertAtNthNode(5,33);
        dl1.displayForward();

        System.out.println("deleteNthNode : ");
        dl1.deleteNthNode(5);
        dl1.displayForward();
    }
}
