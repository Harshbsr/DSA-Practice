package practice;

public class removeNthNodeFromLinkList {
    private static TreeNode head;
    private static class TreeNode{
        int data;
        TreeNode next;


        TreeNode(int data){
            this.data=data;
            next=null;
        }
    }
    static void removeNodeFromEnd(TreeNode node, int position){
        TreeNode dummy = new TreeNode(0);
         dummy.next = node;
      TreeNode slow = dummy;
      TreeNode fast= dummy;
      for(int i=0; i<position;i++){
          fast = fast.next;
      }
      while(fast.next!=null){
          slow=slow.next;
          fast = fast.next;
      }

      slow.next= slow.next.next;

    }

    public static void main(String[] args) {

    }
}
