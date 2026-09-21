class Solution {
    public int mostWordsFound(String[] sentences) {
       int max = 0;
       for(String ch: sentences)
       {
            int curr = ch.split(" ").length;
            if(max < curr)
            {
                max = curr;
            }
       } 
       return max;
    }
}