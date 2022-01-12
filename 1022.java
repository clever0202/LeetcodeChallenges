import java.util.ArrayList;

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
    int BinaryNo(ArrayList<Integer> num){
        int ret = 0;
        // int power = 0;
        for(int i=0; i < num.size(); i++){
            double plus = num.get(i) * Math.pow(2, i);
            ret += plus;
        }
        return ret;
    }

    int TreeTraverse(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(root == null){
            // return ret;
            return 1;
        } else if(root.left == null && root.right == null){
            ret.add(root.val);
            // return ret;
            return BinaryNo(ret);
            
        } else {
            ret.add(root.val);
            TreeTraverse(root.left);
            TreeTraverse(root.right);
            // ret.add(root.val);
        }
        return 0;
    }

    public int sumRootToLeaf(TreeNode root) {
        ArrayList<Integer> num = new ArrayList<>();
        int ret = 0;
        ret = TreeTraverse(root);
        return ret;
        // TreeNode parent = null;
        // TreeNode node = root;
        // while(node != null){
            
        //     parent = node;
        //     node = node.left;

        // }

    }
}