
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDepth(TreeNode node) 
    {
        if (node == null)
            return -1;
        else 
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
 
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else 
                return (rDepth + 1);
        }
    }

    boolean heightBalance(TreeNode node){
        if(node == null){
            return true;
        } else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            boolean val = false;
            if(Math.abs(lDepth - rDepth)<=1){
                val = true;
            }
            boolean lval = heightBalance(node.left);
            boolean rval = heightBalance(node.right);
            return val && lval && rval;
        }
    }

    public boolean isBalanced(TreeNode root) {
        // System.out.println(root.left.val);
        // System.out.println(root.right.val);
        return heightBalance(root);
        // if(root == null){
        //     return true;
        // }
        // TreeNode node1 = root.left;
        // // TreeNode parent1 = root;
        // TreeNode node2 = root.right;
        // int leftcount = maxDepth(node1);
        // int rightcount = maxDepth(node2);
        // // while(node1 != null){
        // //     if(node1.left != null){
        // //         node1 = node1.left;
        // //     } else {
        // //         node1 = node1.right;
        // //     }
        // //     leftcount += 1;
        // // }
        // // while(node2 != null){
        // //     if(node2.left != null){
        // //         node2 = node2.left;
        // //     } else {
        // //         node2 = node2.right;
        // //     }
        // //     rightcount += 1;
        // // }
        // if(Math.abs(leftcount-rightcount)<= 1){
        //     return true;
        // } else {
        //     return false;
        // }
    }
}