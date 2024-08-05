class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
           // int count=0;
            if(hm.get(arr[i])==1){
                count++;
            }
            if(count==k){
                return arr[i];
            }
        }
        return "";
    }
}