class Solution {
    public boolean isPalindrome(int x) {
        String st=String.valueOf(x);
        int a=0;
        int b=st.length()-1;
        while(a<b){
            if(st.charAt(a)!=st.charAt(b)){
                return false;
            }
            else{
                a++;
                b--;
            }
        }
        return true;
        
    }
}