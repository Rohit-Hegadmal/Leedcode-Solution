class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch  = s.charAt(i);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            int len = i - left +1;
            max = Math.max(max , len);
        }
        return max;
    }
}