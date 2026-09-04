class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int n = nums.length;
         int mn = Integer.MAX_VALUE;
         int ans[] = new int[n];
         for(int i=n-1;i>=0;i--)
         {
            mn = Math.min(mn , nums[i]);
            ans[i] = mn;
         }
         int mx = 0;
         for(int i=0;i<n;i++)
         {
            mx = Math.max(mx , nums[i]);
            int count = mx - ans[i];
            if(count <= k)
            {
                return i;
            }
         }
        return -1;
    }
}