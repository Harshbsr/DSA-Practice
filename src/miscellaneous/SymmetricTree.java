package miscellaneous;

import java.util.Stack;

public class SymmetricTree {

    private static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left=null;
            this.right=null;

        }

    }

    public static boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.isEmpty()){
            TreeNode l = stack.pop();
            TreeNode r = stack.pop();
            if(l== null && r == null) {
                continue;
            }
            if(l == null || r==null || r.data!= l.data){
                return false;
            }
            stack.push(l.right);
            stack.push(r.left);
            stack.push(l.left);
            stack.push(r.right);
        }

        return true;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(3);
        root.right= new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right= new TreeNode(5);
        root.right.left= new TreeNode(5);
        root.right.right= new TreeNode(4);
        System.out.println(isSymmetric(root));
    }
}
