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
    int[] preorder;
    int[] inorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        return build(0, preorder.length-1, 0, inorder.length-1);
    }
    private TreeNode build(int preStart,int preEnd,int inStart,int inEnd){
        if(preStart > preEnd || inStart > inEnd)
            return null;
        TreeNode node = new TreeNode(preorder[preStart]);
        int i = 0;
        for(i =0; i<inorder.length; i++)
        {
            if(inorder[i] == node.val)
                break;
        }
        int leftSize = i - inStart;
        node.left=build(preStart+1, preStart+leftSize, inStart, i-1);
        node.right=build(preStart+leftSize+1, preEnd, i+1, inEnd);
        return node;
    }
}
