class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean a=true;
        boolean b=true;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1])
            a=false;
            if(nums[i]>nums[i+1])
            b=false;
        }
        return a||b;
    }
}