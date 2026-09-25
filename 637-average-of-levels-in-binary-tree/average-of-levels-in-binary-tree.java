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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty())
        {
            int l = que.size();
            double sum = 0;

            for(int  i=0;i<l;i++)
            {
                TreeNode curr = que.poll();
                sum += curr.val;
                if(curr.left != null) que.add(curr.left);
                if(curr.right != null) que.add(curr.right);
            }
            ans.add(sum/l);
        }
        return ans;
    }
}