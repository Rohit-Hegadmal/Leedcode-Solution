class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int mn[] = new int[n];
        mn[0] = cost[0];
        mn[1] = cost[1];
        for(int i=2;i<n;i++)
        {
            mn[i] = cost[i] + Math.min(mn[i-1] , mn[i-2]);
        }
        return Math.min(mn[n-1] , mn[n-2]);
    }
}