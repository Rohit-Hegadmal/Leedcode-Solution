class Solution {
    public int buyChoco(int[] prices, int money) {
        int f1 = Integer.MAX_VALUE; 
        int sec =Integer.MAX_VALUE; 
        for(int pri : prices)
        {
            if(pri < f1)
            {
                sec = f1;
                f1 = pri;
            }
            else{
                sec = Math.min(pri , sec);
            }
        }
        if((f1 + sec) > money)
        {
            return money;
        }
        return money - (f1 + sec);
    }
}