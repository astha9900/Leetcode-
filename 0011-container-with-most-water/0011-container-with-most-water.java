class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int a=0;
        int b=n-1;
        int max=0;
        while(a<b){
            int area=(b-a)*Math.min(height[a],height[b]);
            max=Math.max(max,area);
            if(height[a]<height[b]){
                a++;
            }
            else{
                b--;
            }
        }
        return max;
        
    }
}