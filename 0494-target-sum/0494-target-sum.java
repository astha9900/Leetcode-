class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sumArray = 0;
        int n=nums.length;
        for (int i=0;i<n;i++) {
            sumArray+=nums[i];
        }
        // If (sumArray + d) is odd or sumArray < d,we cannot partition the array as required
        if((sumArray+target)%2 != 0 || sumArray<Math.abs(target)){
            return 0;
        }
        int targetSum=(sumArray+target)/2;
        return perfectSum(nums, targetSum);
    }
    public static int perfectSum(int nums[],int target) {
        int n=nums.length;
	    int MOD=1000000007;
	    int dp[][]=new int[n+1][target+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=(dp[i-1][j-nums[i-1]]+dp[i-1][j])%MOD;
                }
                else{
                    dp[i][j]=(dp[i-1][j])%MOD;
                }
            }
        }
        return dp[n][target];
    }
}