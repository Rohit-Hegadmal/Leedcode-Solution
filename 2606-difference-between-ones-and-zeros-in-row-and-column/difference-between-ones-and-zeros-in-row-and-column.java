class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int oner[] =new int[m];
        int onec[] =new int[n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                {
                    oner[i] +=1;
                    onec[j] +=1;
                }
            }
        } 
        int diff[][] = new int[m][n];
            for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               int onesRowi= oner[i];
               int onesColj=onec[j];
               int zerosRowi = n-onesRowi;
               int zerosColj = m-onesColj;
               diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj;
            }
        } 
       return diff; 
    }
}