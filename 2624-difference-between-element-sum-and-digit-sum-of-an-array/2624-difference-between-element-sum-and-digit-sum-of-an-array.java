class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int val=nums[i];
            while(val>0){
                int x=val%10;
                digitsum+=x;
                val=val/10;
            }
        }
        return Math.abs(sum-digitsum);
        
        
    }
}