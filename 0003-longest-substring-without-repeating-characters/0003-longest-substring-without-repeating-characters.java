class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        int n=s.length();
        while(j<n){ 
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                max=Math.max(max,j-i+1);
                j++;
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}