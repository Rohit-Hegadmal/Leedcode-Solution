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
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> ans = new ArrayList<>();
      pre(root , "" ,  ans);
      return ans;
    }
    public void pre(TreeNode node , String str , List<String> res)
    {
        if(node == null) return;
        if(str.isEmpty())
        {
            str = str + node.val;
        }else{
            str = str  + "->" +  node.val;
        }

        if(node.left == null && node.right == null)
        {
            res.add(str);
        }

        pre(node.left, str , res);
        pre(node.right , str , res);
    }
}