class Solution {
    public int maximizeSum(int[] nums, int k) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                largest=nums[i];
            }  
        }
        int ans=0;
        while(k>0){
        ans+=largest;
        largest=largest+1;
        k--;
        }
        return ans;    
    }
}