class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            int alpha = ch -'a' + 1;
            int rev = 27 - alpha;
            int pos = i + 1;
            int pro = rev * pos;
            sum = sum + pro;
        }
        return sum;
    }
}