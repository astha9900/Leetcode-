class Solution {
    public boolean judgeSquareSum(int c) {
        int a=0;
        int ans=0;
        if(c==0){
            return true;
        }
        for(int i=(int)Math.sqrt(c);i>0;i--){
            int b=(int)Math.sqrt(c-i*i);
            ans=b*b+i*i;
            if(c==ans){
                return true;
            }
        }
        return false;

    }
}