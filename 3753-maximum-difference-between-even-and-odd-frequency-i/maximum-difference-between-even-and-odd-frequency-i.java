class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        int  freq[] = new int[26];
        for(char ch : s.toCharArray())
        {
            freq[ch - 'a']++;
        }
        int odd = 0;
        int even = n+1;
        for(int i=0;i<26;i++)
        {
            if(freq[i] == 0) continue;

            if(freq[i]%2 == 0)
            {
                even = Math.min(even , freq[i]);
            }
            else{
                odd = Math.max(odd , freq[i]);
            }
        }
        return odd- even;
    }
}