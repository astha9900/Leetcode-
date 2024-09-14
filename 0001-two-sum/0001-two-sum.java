class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(hm.containsKey(n)){
                return new int[]{i,hm.get(n)};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return null;
        
    }
}