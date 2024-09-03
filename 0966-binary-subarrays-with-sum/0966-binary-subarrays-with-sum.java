class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==goal){
                    count++;
                }
            }
            sum=0;
        }
        return count;
        
    }
}