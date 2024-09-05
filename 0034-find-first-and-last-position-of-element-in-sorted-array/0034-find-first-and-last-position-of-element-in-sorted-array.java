class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]=new int[2];
        result[0]=Findfirst(nums,target);
        result[1]=LastPosition(nums,target);
        return result;
        
    }
    private int Findfirst(int [] nums,int target){
        int low=0;
        int high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=(low +high)/2;
            if(target==nums[mid]){
                result=mid;
                high=mid-1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return result;
    }
    
    private int LastPosition(int [] nums,int target){
        int low=0;
        int high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=(low +high)/2;
            if(target==nums[mid]){
                result=mid;
                low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            
            else{
                low=mid+1;
            }
            
        }
        return result;
    }
    

}