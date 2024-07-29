class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int N=nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
        boolean dp[][]=new boolean[N+1][sum+1];
        for(int i=0;i<N+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }
        for(int i=1;i<N+1;i++){
            for(int j=1;j<sum+1;j++){
                
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j-nums[i-1]]||dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
                
            }
        }
        return dp[N][sum];
        
    }
}