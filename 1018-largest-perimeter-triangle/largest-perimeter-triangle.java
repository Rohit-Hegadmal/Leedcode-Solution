class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int x=n-3;x>=0;x--)
        {
            if(nums[x] + nums[x+1] > nums[x+2])
            {
                return nums[x] + nums[x+1] + nums[x+2];
            }
        }
        return 0;
    }
}