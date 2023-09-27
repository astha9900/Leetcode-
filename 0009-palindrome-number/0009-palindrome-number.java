class Solution {
    public boolean isPalindrome(int x) {
        String st=String.valueOf(x);
        int lp=0;
        int rp=st.length()-1;
        while(lp<rp){
            if(st.charAt(lp)!=st.charAt(rp))
            return false;
            lp++;
            rp--;
        }
        return true;
        
    }
}