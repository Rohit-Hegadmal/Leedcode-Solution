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
    public int averageOfSubtree(TreeNode root) {
       int ans[] =  post(root);
        return ans[2];
    }
    public int[] post(TreeNode root)
    {
        if(root == null) return new int[]{0,0,0};
        int left[] = post(root.left);
        int ri[] = post(root.right);
        
        int sum = left[0] + ri[0] + root.val;
        int count = left[1] + ri[1] + 1;
        int res = left[2] + ri[2];
        if(root.val == sum/count)
        {
            res++;
        }
        return new int[]{sum , count , res};
    }
}