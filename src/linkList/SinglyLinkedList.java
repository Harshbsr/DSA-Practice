package linkList;


public class SinglyLinkedList {

    private Node head;

    private static class Node{
        // parameter of link list
        private int data; // generic type
        private Node next;// represent the address of next node




        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public void display(){
        Node current = head;
        while(current !=null){
            System.out.print(current.data+ "--> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    public int  foundLength(){
        if(head==null){;
            return 0;
        }
        int count=0;
        Node current = head;
        while(current !=null){
           count++;
            current = current.next;
        }
        return count;
    }

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if (head==null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next=newNode;
        newNode.next=null;
    }

    public void insertAtPosition(int position,int value){
        Node newNode = new Node(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        int count=1;
        Node previous= head;
        while(count<position-1){
            previous=previous.next;
            count++;
        }
        Node current = previous.next;
        previous.next= newNode;
        newNode.next=current;

    }

    public void deleteAtFirst(){
        if(head==null){
            return;
        }
        head = head.next;

    }

    public void deleteAtEnd(){
        if(head==null || head.next==null){
            return ;
        }

        Node previous = head;
        Node current= head;        //             p    c
        while(current.next !=null){//75--> 80--> 6--> 10 --> null
            previous = current;
            current = current.next;
        }
        previous.next=null;
    }

    public void deleteAtPosition(int position){
        if(position==1){
            head=head.next;
            return;
        }
        //10-->40--> 60--> null

        int count=1;
        Node previous = head;
        while(count<position-1){
            previous=previous.next;
            count++;
        }

        Node current = previous.next;
        previous.next=current.next;
    }

    public int search(int n){
        Node current = head;
        int count=1;
        while(current !=null){
            if(current.data==n){
                return count;
            }else{
                current=current.next;
                count++;
            }
        }
        return -1;
    }

    public void reverse(){
        Node current= head;
        Node previous= null;
        Node next= null;

        //80--> 10--> 20--> 30--> 40--> null
        while(current!= null){
            next=current.next;
            current.next=previous;
            previous= current;
            current=next;
        }
        head = previous;  // update head to the new first node
    }

    public int getNthNodeFromEnd(int n){
        if(head==null || n<=0){
            return -1;
        }
        //       m     m       r*    r    r
        //80--> 10--> 20--> 30--> 40--> null
        Node mainPtr = head;
        Node refPtr = head;
        int count=0;
        while(count<n){
            if(refPtr==null){
                return -1;
            }
            refPtr = refPtr.next;
            count++;
        }

        while(refPtr!=null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr.data;
    }

    public void removeDuplicateFromSortedList(){
        Node current = head;
        while( current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }

        }
    }

  public void  insertValueInSortedList(int value){
         Node newnode = new Node(value);
         Node current = head;
         Node previous =null;
         while(current!= null && current.data < value){
             previous= current;
             current = current.next;
         }
      newnode.next = current;
      previous.next = newnode;


  }

  public void removeValueFromList(int value){
         Node current = head;
          Node previous= null;

          while( current!=null && current.data!=value){
              previous = current;
              current = current.next;
          }
      previous.next = current.next;
  }

  public boolean  findLoopInLinkList(){
        Node slowPtr = head;
        Node fastPtr= head;
        while(fastPtr!=null && fastPtr.next!= null){
            fastPtr = fastPtr.next.next;
            slowPtr =slowPtr.next;

            if(fastPtr ==slowPtr){
                return true;
            }
        }
      return false;
  }

    public Node  startNodeInLoop(){
        Node slowPtr = head;
        Node fastPtr= head;
        while(fastPtr!=null && fastPtr.next!= null){
            fastPtr = fastPtr.next.next;
            slowPtr =slowPtr.next;

            if(fastPtr ==slowPtr){
                return getStringNode(slowPtr);
            }
        }
        return null;
    }
    public Node getStringNode(Node slowPtr){
        Node temp = head;

        while(temp!=slowPtr){
            slowPtr=slowPtr.next;
            temp= temp.next;
        }
        return slowPtr;

    }

    public void removeLoop(){

        Node slowPtr = head;
        Node fastPtr= head;
        Node temp=head;
        Node previous=null;
        while(fastPtr!=null && fastPtr.next!= null){
            fastPtr = fastPtr.next.next;
            slowPtr =slowPtr.next;

            if(fastPtr ==slowPtr){
                while(temp.next!=slowPtr.next){
                    previous=slowPtr;
                    slowPtr=slowPtr.next;
                    temp= temp.next;
                }

                previous.next=null;
            }
        }
    }

     public static Node mergeSortedList(Node a, Node b){
        Node dummy = new Node(0);
        Node tail= dummy;

        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next= a;
                a=a.next;
            }else{
                tail.next= b;
                b=b.next;
            }
            tail=tail.next;
        }

        if(a==null){
            tail.next= b;
        }else{
            tail.next= a;
        }
    return dummy.next;
     }

     public static Node addTwoLinkList(Node a, Node b){
         Node dummy = new Node(0);
         Node tail= dummy;
         int carry=0;
         while(a!=null || b!=null){
             int x= a!=null? a.data:0;
             int y= b!=null? b.data:0;

             int sum= carry+x+y;
             carry=sum/10;
             tail.next= new Node(sum%10);
             tail = tail.next;

             if(a!=null){a = a.next;}
             if(b!=null){b = b.next;}
         }

         if(carry>0){
             tail.next=new Node(carry);
         }

         return dummy.next;
     }

    public static void main(String args[]){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        // now we link the nodes together
        sll.head.next = second;
        second.next=third;
        third.next=fourth;
        System.out.println("Print a Link List: ");
        sll.display();
        System.out.println("Length of link list is: "+sll.foundLength());
        sll.insertAtFirst(6);
        System.out.println("After inserting at first: ");
        sll.display();

        System.out.println("After inserting at End: ");
        sll.insertAtEnd(60);
        sll.display();

        System.out.println("Nth Position: Inserting value at 1st position: ");
        sll.insertAtPosition(1,72);
        sll.display();
        System.out.println("Nth Position: Inserting value at end position: ");
        sll.insertAtPosition(8,73);
        sll.display();
        System.out.println("Nth Position: Inserting value at 2ndh position: ");
        sll.insertAtPosition(2,75);
        sll.display();

        System.out.println("Nth Position: Inserting value at 3rd position: ");
        sll.insertAtPosition(3,80);
        sll.display();

        System.out.println("Delete first node: ");
        sll.deleteAtFirst();
        sll.display();

        System.out.println("Delete End node: ");
        sll.deleteAtEnd();
        sll.display();

        System.out.println("Nth Position: Delete 1st node: ");
        sll.deleteAtPosition(1);
        sll.display();

        System.out.println("Nth Position: Delete End node: ");
        sll.deleteAtPosition(7);
        sll.display();

        System.out.println("Nth Position: Delete 2nd node: ");
        sll.deleteAtPosition(2);
        sll.display();
        System.out.println("Search value 20 in link list: "+sll.search(20));

        System.out.println("Reverse linkList: ");
        sll.reverse();
        sll.display();

        System.out.println("Nth Node from End:"+sll.getNthNodeFromEnd(3));

        System.out.println("Nth Node from End:"+sll.getNthNodeFromEnd(-1));

        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.head = new Node(10);
        Node second2 = new Node(10);
        Node third3 = new Node(30);
        Node thir3 = new Node(40);
        Node fourth4 = new Node(40);
        sll2.head.next = second2;
        second2.next=third3;
        third3.next=thir3;
        thir3.next=fourth4;
        System.out.println("Print a Link List2 ");
        sll2.display();
        sll2.removeDuplicateFromSortedList();
        System.out.println("removeDuplicateFromSortedList ");
        sll2.display();
        sll2.insertValueInSortedList(33);
        System.out.println("insertValueInSortedList: ");
        sll2.display();

        sll2.removeValueFromList(30);
        System.out.println("removeValueFromList: ");
        sll2.display();


        SinglyLinkedList sll3 = new SinglyLinkedList();
        sll3.head = new Node(10);
        Node second3 = new Node(10);
        Node third4 = new Node(30);
        Node five5 = new Node(40);
        Node fourth6 = new Node(40);
        sll3.head.next = second3;
        second3.next=third4;
        third4.next=five5;
        five5.next=fourth6;
        fourth6.next=third4;
        System.out.println(sll3.findLoopInLinkList());
        System.out.println("startNodeInLoop: "+sll3.startNodeInLoop().data);
        sll3.removeLoop();
        System.out.println("break loop ");
        sll3.display();


        SinglyLinkedList sll4 = new SinglyLinkedList();
        sll4.head = new Node(10);
        Node second4 = new Node(30);
        Node third5 = new Node(40);
        Node five6 = new Node(70);
        sll4.head.next = second4;
        second4.next=third5;
        third5.next=five6;
        five6.next=null;

        SinglyLinkedList sll5 = new SinglyLinkedList();
        sll5.head = new Node(20);
        Node second5 = new Node(50);
        Node third6 = new Node(60);
        Node five7 = new Node(80);
        Node fourth8 = new Node(90);
        sll5.head.next = second5;
        second5.next=third6;
        third6.next=five7;
        five7.next=fourth8;
        fourth8.next=null;

        System.out.println("Link List a: ");
        sll4.display();

        System.out.println("Link List b: ");
        sll5.display();

        SinglyLinkedList result = new SinglyLinkedList();
        result.head = mergeSortedList(sll4.head,sll5.head);

        System.out.println("Merged Link List: ");
        result.display();

        SinglyLinkedList sll6 = new SinglyLinkedList();
        sll6.head = new Node(1);
        Node sec = new Node(3);
        Node thir = new Node(4);
        Node fiv = new Node(7);
        sll6.head.next = sec;
        sec.next=thir;
        thir.next=fiv;
        fiv.next=null;

        SinglyLinkedList sll7 = new SinglyLinkedList();
        sll7.head = new Node(2);
        Node sec1 = new Node(5);
        Node thir1 = new Node(6);
        Node fiv1 = new Node(8);
        Node four1 = new Node(9);
        sll7.head.next = sec1;
        sec1.next=thir1;
        thir1.next=fiv1;
        fiv1.next=four1;
        four1.next=null;

        System.out.println("Link List a: ");
        sll6.display();

        System.out.println("Link List b: ");
        sll7.display();
        SinglyLinkedList result2 = new SinglyLinkedList();
        result2.head = addTwoLinkList(sll6.head,sll7.head);
        System.out.println("Link List a+b: ");
        result2.display();


    }
}
