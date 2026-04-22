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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public int dfs(TreeNode node, int maxVal)
    {
        int goodNode = 0;
        if(node == null)
            return 0;
        else if(node.val >= maxVal)
        {
            goodNode = 1;
            maxVal = node.val;
        }
        int a = dfs(node.left, maxVal);
        int b = dfs(node.right, maxVal);
        return a+b + goodNode;
    }
}
