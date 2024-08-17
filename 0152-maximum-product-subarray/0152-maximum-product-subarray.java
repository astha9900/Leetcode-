class Solution {
    public int maxProduct(int[] nums) {
        double p=1;
        double q=1;
        int n=nums.length;
	    double maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
            maxSum=Math.max(maxSum,p);
            if(p==0){
                p=1;
            }
        }
        for(int i=n-1;i>=0;i--){
            q*=nums[i];
            maxSum=Math.max(maxSum,q);
            if(q==0){
                q=1;
            }
        }
        return (int)maxSum;
    }
}