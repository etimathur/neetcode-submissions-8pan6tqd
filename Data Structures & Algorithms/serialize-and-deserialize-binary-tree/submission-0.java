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
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return dfs(root);
    }
    private String dfs(TreeNode root) {
        StringBuilder s = new StringBuilder("");
        if(root == null)
        {
            return s.append("null,").toString();
        }
        s.append(root.val + ",");
        s.append(dfs(root.left));
        
        s.append(dfs(root.right));
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] res = data.split(",");
        return getStr(res, new int[] {0});
    }
    private TreeNode getStr(String[] data, int[] i){
        if(data[i[0]].equals("null"))
        {
            i[0]++;
            return null;

        }
        TreeNode t = new TreeNode(Integer.parseInt(data[i[0]]));
        i[0]++;
        t.left = getStr(data, i);
        t.right = getStr(data, i);
        return t;
    }
}
