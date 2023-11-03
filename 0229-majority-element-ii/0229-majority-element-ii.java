class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);

            }
            else{
                hm.put(nums[i],1);
            }
        }
        Set<Integer> keySet=hm.keySet();
        for(Integer key:keySet){
            if(hm.get(key)>nums.length/3)
            ans.add(key);
        }
        return ans;
        
    }
}