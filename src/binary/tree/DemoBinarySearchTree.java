package binary.tree;

public class DemoBinarySearchTree {

    private TreeNode root ;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }

    public TreeNode insert(TreeNode root, int value){
        if(root==null){
            root= new TreeNode(value);
            return root;
        }

        if(value<root.data){
            root.left= insert(root.left,value);
        }

        if(value>root.data){
            root.right= insert(root.right,value);
        }

        return root;
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public TreeNode search( TreeNode root, int value){
        if(root==null || root.data== value){
            return root;
        }

        if(value< root.data){
           return search(root.left, value);
        }else{
            return  search(root.right, value);
        }

    }

    public boolean isValidBST(TreeNode root,long min,long max){

        if(root==null){
            return true;
        }

        if(root.data<=min || root.data>=max ){
            return false;
        }
        boolean left= isValidBST(root.left,min,root.data);

        if(left){
            boolean right= isValidBST(root.right,root.data,max);
            return right;
        }
        return false;

    }

    public static void main(String[] args){
        DemoBinarySearchTree bst = new DemoBinarySearchTree();

        bst.root = bst.insert(bst.root,7);
        bst.root = bst.insert(bst.root,5);
        bst.root = bst.insert(bst.root,3);
        bst.root = bst.insert(bst.root,2);
        bst.root = bst.insert(bst.root,8);
        bst.root = bst.insert(bst.root,9);
        bst.root = bst.insert(bst.root,6);
        bst.inorder(bst.root);// if it is a binarySearch tree, the output will be in sorted order if we use inorder traversal
        System.out.println();
        if(null!=bst.search(bst.root, 78)) {
            System.out.println("Value is found in Binary search tree ");
        } else {
            System.out.println("Value is not found in Binary search tree ");
        }
        System.out.println(bst.isValidBST(bst.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
