class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0;
        int b=0;
        int max=0;
        int n=s.length();
        HashSet<Character> hm=new HashSet<>();
        while(b<n){
            char ch=s.charAt(b);
            if(!hm.contains(ch)){
                hm.add(ch);
                max=Math.max(hm.size(),max);
                b++;
            }
            else{
                hm.remove(s.charAt(a));
                a++;
            }
        }
        return max;

        
    }
}