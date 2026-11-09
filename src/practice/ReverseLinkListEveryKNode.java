package practice;


public class ReverseLinkListEveryKNode {

    private static TreeNode head;

    private static class TreeNode {
        private static int data;
        private static TreeNode next;
        TreeNode(int data){
            this.data = data;
            this.next = null;
        }

    }
    static TreeNode reverse(TreeNode node, int k){
        TreeNode temp=node;
        for(int i=0;i<k;i++){
            if(temp==null){
                return node;
            }else {
                temp = temp.next;
            }
        }
        TreeNode current = node;
        TreeNode previous=null;
        TreeNode forward=null;
        for(int i=0;i<k;i++){
            forward = current.next;
            current.next = previous;
            previous=current;
            current= forward;
        }
        node.next= reverse(current,k);
return previous;
    }


    public static void main(String[] args) {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode (3);
        TreeNode fourth = new TreeNode (4);
        TreeNode fifth = new TreeNode (5);
        TreeNode sixth = new TreeNode (6);
        TreeNode seventh = new TreeNode (7);
        TreeNode eighth = new TreeNode (8);

        head=first;
        first.next = second;
        second.next= third;
        third.next = fourth;
        fourth.next =fifth;
        fifth.next =sixth;
        sixth.next =seventh;
        seventh.next =eighth;
        eighth.next=null;

    }
}
