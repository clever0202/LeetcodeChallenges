import java.util.List;

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
    void Traverse(TreeNode root, List ls){
        if(root == null){
            return;
        }
        Traverse(root.left, ls);
        Traverse(root.right, ls);
        ls.add(root.val);
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ls = new ArrayList<Integer>();
        Traverse(root1, ls);
        Traverse(root2, ls);
        Collections.sort(ls);
        return ls;
    }
}