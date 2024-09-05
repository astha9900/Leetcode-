class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        int a=0;
        int b=grid[0].length-1;
        while(a<n&&b>=0){
            if(grid[a][b]>=0){
                a++;
            }
            else{
                count+=n-a;
                b--;
            }
        }
        return count;

        
    }
}