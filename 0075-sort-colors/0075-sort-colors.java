class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int r=nums.length-1;
        for(int i=0;i<=r;i++){
            if(nums[i]==0){
                int temp=nums[l];
                nums[l]=nums[i];
                nums[i]=temp;
                l++;
            }
            else if(nums[i]==2){
                int temp=nums[r];
                nums[r]=nums[i];
                nums[i]=temp;
                r--;
                i--;

            }
        }
       
    }
}