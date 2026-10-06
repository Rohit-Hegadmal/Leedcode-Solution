class Solution {
    public int minAddToMakeValid(String s) {
        int openb = 0 , close = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                openb += 1;
            }
            else{
                if(openb >0)
                {
                    openb -= 1;
                }
                else{
                    close += 1;
                }
            }
        }
         return openb + close;
    }
}