class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxp=1;
        int minp=1;
        for(int i=0;i<nums.length;i++){
            maxp=nums[n-1]*nums[n-2];
            minp=nums[0]*nums[1];
        }
        return (maxp-minp);
    }
}