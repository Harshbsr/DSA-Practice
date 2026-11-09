package practice;

public class FloydCycleDetectionAlgorithm {
     private static TreeNode head;

    private static class TreeNode{
        int data;
        TreeNode next;

        TreeNode(int data){
            this.data=data;
            next=null;
        }
    }
     static boolean isFloydCycleDetected(TreeNode node){
        TreeNode slow=node;
        TreeNode fast = node;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;

     }
/*
that meeting point, Floyd's mathematical property tells us:

The distance from head to the cycle start is equal to the distance from the meeting point to the cycle start.
 */
    static TreeNode floydCycleDetected(TreeNode node){
        TreeNode slow=node;
        TreeNode fast = node;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                TreeNode temp = head;
                while(temp!=slow){
                    slow = slow.next;
                    temp=temp.next;
                }
                return temp;
            }
        }
        return null;

    }

    static TreeNode findMiddle(TreeNode node) {
        TreeNode slow=node;
        TreeNode fast = node;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(5);

        head=first;
        first.next = second;
        second.next= third;
        third.next = fourth;
        fourth.next =third;

        System.out.println(isFloydCycleDetected(head));
        System.out.println(floydCycleDetected(head));

    }
}
