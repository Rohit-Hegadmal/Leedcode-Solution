class Solution {
    public int findCenter(int[][] edges) {
        int first[] = edges[0];
        int sec[] = edges[1];
        if(first[0] == sec[0] || first[0] == sec[1])
        {
            return first[0];
        }
        return first[1];
    }
}