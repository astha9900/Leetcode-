class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    int n=nums.length;
    int res[]=new int[k];
    HashMap<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<n;i++){
           mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
       }
    PriorityQueue<Integer>minHeap=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        for(int key : mp.keySet()){
            minHeap.add(key);
        }     
        for(int i=0;i<k;i++){
            res[i]=minHeap.poll();
        }
        return res;
    }
}