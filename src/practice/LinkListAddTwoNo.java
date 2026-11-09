package practice;
/*
Two numbers are represented by linked lists in reverse order.

l1: 2 → 4 → 3
l2: 5 → 6 → 4

This represents:

342 + 465 = 807

So the output should be:

7 → 0 → 8
 */
public class LinkListAddTwoNo {
    private static TreeNode head;

    static class TreeNode{
        private static int data;
        private static TreeNode next;

        TreeNode(int data){
            this.data = data;
            this.next=null;
        }
    }

    static TreeNode addTwoNo(TreeNode node1, TreeNode node2){
       TreeNode first = node1;
       TreeNode second = node2;
       TreeNode dummy= new TreeNode(0);
       TreeNode current = dummy;
        int carry=0;
       while (first!=null || second!=null){
           int firstData = first!=null?first.data:0;
           int secondData = second!=null?second.data:0;
           int sum= (firstData+secondData)+carry;
          int digit = sum%10;
          carry= sum/10;
           current.next =new TreeNode(digit);
           current=current.next;

           if(first!=null){
              first = first.next;
           }
           if(second!=null){
               second = second.next;
           }
       }

       if(carry>0){
           current.next= new TreeNode(carry);
       }
    return dummy.next;
    }
    public static void main(String[] args) {

    }
}
