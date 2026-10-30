class Solution {
    public String largestGoodInteger(String num) {
        char max = 0;
        boolean fnd = false;
        for(int i=2;i<num.length();i++)
        {
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2))
            {
                fnd = true;
                if(num.charAt(i)>max){
                max = num.charAt(i);
                }
            }
        }
        if(!fnd)
        {
            return "";
        }
        return "" +max+max+max;
    }
}