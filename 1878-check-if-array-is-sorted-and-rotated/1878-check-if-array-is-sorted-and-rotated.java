class Solution {
    public boolean check(int[] nums) {
        int a=0;
        int b=nums.length-1;
        for(int i=0;i<b;i++){
            if(i==0&& nums[i]<nums[b]){
                a++;
            }
            if(nums[i]>nums[i+1]){
                a++;
            }
            if(a>1){
                return false;
            }
        }
        return true;
    }
}