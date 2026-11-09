package practice;

public class LinkListIntersection {
    private static TreeNode head;

    class TreeNode{
        private static int data;
        private static TreeNode next;

        TreeNode(int data){
            this.data = data;
            this.next=null;
        }
    }

    static TreeNode getInterSection(TreeNode node1,TreeNode node2){
        TreeNode first = node1;
        TreeNode second = node2;
        while(first!=second){
            if(first==null){
                first=node2;
            }else{
                first = first.next;
            }

            if(second==null){
                second=node1;
            }else{
                second = second.next;
            }
        }

        return first;
    }

    public static void main(String[] args) {

    }
}
