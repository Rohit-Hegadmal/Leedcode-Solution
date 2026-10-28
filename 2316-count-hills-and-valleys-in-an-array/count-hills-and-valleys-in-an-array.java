class Solution {
    public int countHillValley(int[] nums) {
        int cnt = 0, n = nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i] == nums[i-1])
            {
                continue;
            }
            int j=i-1 , k=i+1;
            while(k<n && nums[i] == nums[k]) k++;
            while(j>=0 && nums[i] == nums[j]) j--;

            if(k>=n || j<0) continue;

            if(nums[i] > nums[j] && nums[i] > nums[k]) cnt++;
            else if (nums[i] < nums[j] && nums[i] <nums[k]) cnt++;

        }
        return cnt;
    }
}