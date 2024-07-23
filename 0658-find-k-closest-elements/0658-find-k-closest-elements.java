class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(Math.abs(a-x)<Math.abs(b-x))?1:-1);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            pq.add(arr[i]);
            if(pq.size()>k)
                pq.remove();
        }
        while(!pq.isEmpty()) {
            result.add(pq.remove());
        }
        Collections.sort(result);
        return result;  
    }
}