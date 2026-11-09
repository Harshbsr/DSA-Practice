package practice;

public class PalindromeLinkList {

    private static TreeNode head;

    private static class TreeNode{
        int data;
        TreeNode next;

        TreeNode(int data){
            this.data=data;
            next=null;
        }
    }

    static boolean isPalindromeLinkList(TreeNode node){
       TreeNode slow=head;
       TreeNode fast= head;

       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast= fast.next.next;
       }
       TreeNode current= slow;
       TreeNode forward = slow;
       TreeNode previous = null;

       while(current!=null){
           forward = current.next;
           current.next= previous;
           previous=current;
           current= forward;
       }

       TreeNode temp=head;
       while(previous!=null){
           if(temp.data!=previous.data){
               return false;
           }
           temp=temp.next;
           previous= previous.next;
       }
      return true;
    }
    public static void main(String[] args){

    }
}
