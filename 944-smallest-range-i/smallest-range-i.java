class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int mx = nums[0];
        int mn = nums[0];
        for(int x : nums)
        {
            mx = Math.max(mx , x);
            mn = Math.min(mn , x);
        }
        return Math.max(0,mx - mn - 2*k);
    }
}