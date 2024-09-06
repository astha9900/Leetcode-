class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            int low=0;
            int high=i-1;
            while(low<high){
                if(nums[low]+nums[high]>nums[i]){
                    count+=high-low;
                    high--;
                }
                
                else{
                    low++;
                }

            }
        }
        return count;
    }
}