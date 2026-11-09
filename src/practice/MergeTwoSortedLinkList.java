package practice;


public class MergeTwoSortedLinkList {

    private static TreeNode head;

    private static class TreeNode{
        int data;
        TreeNode next;

        TreeNode(int data){
            this.data=data;
            next=null;
        }
    }

    static TreeNode merge(TreeNode node1,TreeNode node2){
        TreeNode dummy = new TreeNode(0);
        TreeNode current = dummy;
        TreeNode first= node1;
        TreeNode sec = node2;

        while(first!=null && sec!=null){
            if(first.data<=sec.data){
                current.next=first;
                first=first.next;
            }else{
                current.next=sec;
                sec=sec.next;
            }
            current=current.next;
        }

        if(sec!=null){
            current.next=sec;
        } else{
            current.next=first;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(5);
        TreeNode fourth = new TreeNode(7);

        head=first;
        first.next = second;
        second.next= third;
        third.next = fourth;
        fourth.next =null;

        TreeNode first2 = new TreeNode(2);
        TreeNode second2 = new TreeNode(4);
        TreeNode third2 = new TreeNode(6);
        TreeNode fourth2 = new TreeNode(8);

        head=first2;
        first2.next = second2;
        second2.next= third2;
        third2.next = fourth2;
        fourth2.next =null;
    }

}
