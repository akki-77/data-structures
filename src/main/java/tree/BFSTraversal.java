/* 3
Find the BFS Traversal of a Binary Tree
{1,2,3,4,5,6,7} >
 */


import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

    public void levelOrder(TreeNode node) {
        if(node == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            System.out.print(currNode.val + " ");

            if(currNode.left != null) {
                queue.offer(currNode.left);
            }
            if(currNode.right != null) {
                queue.offer(currNode.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        BFSTraversal bFSTraversal = new BFSTraversal();
        bFSTraversal.levelOrder(root);
    }
}
