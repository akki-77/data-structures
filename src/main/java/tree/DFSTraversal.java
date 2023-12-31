/* 2
Find the DFS Traversal of a Binary Tree
{1,2,3,4,5,6,7} >
 */


public class DFSTraversal {

    public void preOrder(TreeNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(TreeNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public void postOrder(TreeNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        DFSTraversal dFSTraversal = new DFSTraversal();
//        dFSTraversal.preOrder(root);
//        dFSTraversal.inOrder(root);
        dFSTraversal.postOrder(root);
    }
}