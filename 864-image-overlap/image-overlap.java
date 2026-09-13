class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int ans = 0;
        for(int dow = -(n-1);dow<=n-1;dow++)
        {
            for(int r = -(n-1);r<=n-1;r++)
            {
                int count =0;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        if(img1[i][j] == 1)
                        {
                            int newr = i+dow;
                            int newc = j + r;

                            if(newr >= 0 && newr < n && newc >= 0 && newc < n && img2[newr][newc] == 1)
                            {
                                count++;
                            }
                        }
                    }
                }
                ans = Math.max(ans , count);
            }
        }
        return ans;
    }
}