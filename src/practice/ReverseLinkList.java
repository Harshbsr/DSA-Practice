package practice;

public class ReverseLinkList {

   private static TreeNode head;

    private static class TreeNode {
        private static int data;
        private static TreeNode next;
        TreeNode(int data){
            this.data = data;
            this.next = null;
        }

    }
    static void reverse(){
        TreeNode current = head;
        TreeNode previous=null;
        TreeNode forward=null;
        while(current!=null){
            forward = current.next;
            current.next = previous;
            previous=current;
            current= forward;
        }

        head= previous;
    }


    public static void main(String[] args) {
       TreeNode first = new TreeNode(1);
       TreeNode second = new TreeNode(2);
       TreeNode third = new TreeNode (3);
       TreeNode fourth = new TreeNode (4);

        head=first;
        first.next = second;
        second.next= third;
        third.next = fourth;
        fourth.next =third;

    }
}
