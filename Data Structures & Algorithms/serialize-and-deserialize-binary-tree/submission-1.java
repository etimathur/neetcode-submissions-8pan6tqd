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

public class Codec {
    StringBuilder s = new StringBuilder();
    int i = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        s = new StringBuilder();
        dfs(root);
        return s.toString();
    }
    private void dfs(TreeNode root) {
        
        if(root == null)
        {
            s.append("null,");
            return;
        }
        s.append(root.val + ",");
        dfs(root.left);
        
        dfs(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        i = 0;
        String[] res = data.split(",");
        return getStr(res);
    }
    private TreeNode getStr(String[] data){
        String val = data[i];
        if(val.equals("null"))
        {
            i++;
            return null;

        }
        TreeNode t = new TreeNode(Integer.parseInt(val));
        i++;
        t.left = getStr(data);
        t.right = getStr(data);
        return t;
    }
}
