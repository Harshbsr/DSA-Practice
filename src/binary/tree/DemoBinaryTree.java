package binary.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoBinaryTree {
   private TreeNode root;


    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public void createTree(){

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left= second;
        first.right=third;
        second.left= fourth;
        second.right=fifth;
    }
      public void preOrderRecursive(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
          preOrderRecursive(root.left);
          preOrderRecursive(root.right);
      }

      public void preOrderIterative(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp= null;
        stack.push(root);
        while(!stack.isEmpty()){
            temp= stack.pop();
            System.out.print(temp.data+" ");//
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }

        }

      }

    public void inOrderRecursive(TreeNode root){
        if(root==null){
            return;
        }

        inOrderRecursive(root.left);
        System.out.print(root.data+" "); //4 2 5 1 3
        inOrderRecursive(root.right);
    }

    public void inOrderIterative(TreeNode root) {
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while(!stack.isEmpty()|| temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp= stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }

    public void postOrderRecursive(TreeNode root){
        if(root==null){
            return;
        }

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data+" ");
    }

    public void postOrderIterative(TreeNode root) {
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(!stack.isEmpty()|| current!=null){
            if(current!=null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode temp = stack.peek().right;
                if (temp==null){
                    temp= stack.pop();
                    System.out.print(temp.data+" ");
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp= stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }else{
                    current = temp;
                }
            }
        }
    }
  public void levelOrderTraversal(TreeNode root){
      Queue<TreeNode> queue = new LinkedList<>();
      TreeNode temp = null;
      queue.offer(root);
      while(!queue.isEmpty()){
          temp= queue.poll();
          System.out.print(temp.data+" ");

          if(temp.left!=null){
              queue.offer(temp.left);
          }
          if(temp.right!=null){
              queue.offer(temp.right);
          }
      }
  }

  public int maxValurInBT(TreeNode root) {
      if (root == null) {
          return Integer.MIN_VALUE;
      }

      int result = root.data;

      int left = maxValurInBT(root.left);
      int right = maxValurInBT(root.right);
      if (left > result) {
          result = left;
      }
      if (right > result) {
          result = right;
      }
      return result;
  }

    public int minValurInBT(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int result = root.data;

        int left = minValurInBT(root.left);
        int right = minValurInBT(root.right);
        if (left <result) {
            result = left;
        }
        if (right < result) {
            result = right;
        }

        return result;
    }
    public static void main(String[] args){
        DemoBinaryTree binaryTree = new DemoBinaryTree();
        binaryTree.createTree();
        binaryTree.preOrderRecursive(binaryTree.root);// recursion internally using stack
        System.out.println("");
        binaryTree.preOrderIterative(binaryTree.root);
        System.out.println("");
        binaryTree.inOrderRecursive(binaryTree.root);
        System.out.println("");
        binaryTree.inOrderIterative(binaryTree.root);
        System.out.println("");
        binaryTree.postOrderRecursive(binaryTree.root);
        System.out.println("");
        binaryTree.postOrderIterative(binaryTree.root);
        System.out.println("");
        binaryTree.levelOrderTraversal(binaryTree.root);
        System.out.println("");
        System.out.println("Max: " + binaryTree.maxValurInBT(binaryTree.root));
        System.out.println("Min: " + binaryTree.minValurInBT(binaryTree.root));
    }
}
