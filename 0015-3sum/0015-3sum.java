class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target=0;
        int n=nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> s=new HashSet<>();
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        result.addAll(s);
        return result;
        
    }
}