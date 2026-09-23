class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int alice = 0 , bob = 0;

      for(int a : aliceSizes) alice += a;
      for(int b : bobSizes) bob += b;

      int diff = (bob - alice)/2;

    Set<Integer> set = new HashSet<>();
    for(int c : bobSizes) set.add(c);

    for(int x : aliceSizes)
    {
        if(set.contains(x + diff))
        {
            return new int[]{x , x + diff};
        }
    } 
        return new int[]{};
    }
}