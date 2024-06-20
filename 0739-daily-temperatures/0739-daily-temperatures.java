class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> s=new Stack<>();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            int curr=temperatures[i];
            while(!s.isEmpty()&&curr>temperatures[s.peek()]){
                int b=s.pop();
                a[b]=i-b;
            }
            s.push(i);
        }
        return a;
        
    }
}