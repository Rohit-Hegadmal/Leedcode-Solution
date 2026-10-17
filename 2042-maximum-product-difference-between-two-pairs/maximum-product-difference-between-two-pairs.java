class Solution {
    public int maxProductDifference(int[] nums) {
        int f1 = 0 , f2 = 0;
        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;
        for(int n: nums)
        {
            if(n < s1)
            {
                s2 = s1;
                s1 = n;
            }
            else if(n < s2)
            {
                s2 = n;
            }
            if(n > f1)
            {
                f2 = f1;
                f1 = n;
            }
            else if(n > f2)
            {
                f2 = n;
            }
        }
        return f1*f2 - s1*s2;
    }
}