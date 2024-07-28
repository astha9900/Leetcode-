class Solution {
    public int minInsertions(String s) {
        int m=s.length();
        int n=s.length();
        int dp[][]=new int[m+1][n+1];
        StringBuilder S=new StringBuilder(s); //reverse the 2 nd part and check
        String str=S.reverse().toString();
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==str.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return n-dp[m][n];
    }
}