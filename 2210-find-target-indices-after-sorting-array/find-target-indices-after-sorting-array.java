class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
       int l = 0 , e = 0;
       for(int x : nums)
       {
        if(x < target) l++;
        else if(x == target) e++;
       }
       for(int i=0;i<e;i++)
       {
          res.add(l +i);
       }
       return res;
    }
}