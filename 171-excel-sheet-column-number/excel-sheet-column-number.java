class Solution {
    public int titleToNumber(String Title) {
       int ans = 0;
       for(int i=0;i<Title.length();i++)
       {
            char c = Title.charAt(i);
            int value = c - 'A'+1;
            ans = ans*26 + value;
       }
      return ans;
    }
}