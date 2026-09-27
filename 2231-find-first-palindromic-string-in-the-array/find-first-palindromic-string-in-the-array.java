class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(isSame(words[i]))
            {
                return words[i];
            }
        }
     return "";
    }
    public boolean isSame(String ans)
    {
        int le = 0;
        int ri = ans.length() - 1;
        while(le < ri)
        {
            if(ans.charAt(le) != ans.charAt(ri))
            {
                return false;
            }
            le++;
            ri--;
        }
        return true;
    }
}