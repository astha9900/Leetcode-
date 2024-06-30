class Solution {
    public int longestOnes(int[] nums, int k) {
        int a=0;
        int b=0;
        int count=0;
        int n=nums.length;
        int max=0;
        while(b<n){
            if(nums[b]==0){
                count++;
            }
            if(count>k){
                if(nums[a]==0){
                    count--;
                }
                a++;
            }
            b++;
            max=Math.max(max,b-a);
        }
        return max;
        
    }
}