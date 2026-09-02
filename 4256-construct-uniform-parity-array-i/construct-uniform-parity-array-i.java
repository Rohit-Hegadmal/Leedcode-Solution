class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int nums[] = new int[n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                nums[i] = nums1[i] - nums1[j];
                nums[i] = nums1[i];
                if(nums[i] % 2 == 0 || nums[i]%2 != 0)
                {
                    return true;
                }
            }
        }
        return false;
    }
}