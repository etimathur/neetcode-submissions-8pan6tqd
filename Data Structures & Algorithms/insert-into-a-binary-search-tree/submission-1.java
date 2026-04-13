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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
            return new TreeNode(val);
        
        TreeNode res = root;
        while(true){
            if(val > res.val){
                if(res.right == null)
                {
                    res.right = new TreeNode(val);
                    return root;
                }
                res = res.right;
            }
            else {
                if(res.left == null)
                {
                    res.left = new TreeNode(val);
                    return root;
                }
                res = res.left;
            }
        }
    }
}