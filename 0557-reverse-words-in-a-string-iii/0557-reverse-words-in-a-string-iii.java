class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" "); 
        StringBuilder ans=new StringBuilder();
        for (String word:words) {
            StringBuilder ultaword= new StringBuilder(word);
            ultaword.reverse();
            ans.append(ultaword).append(" ");
        }    
        return ans.toString().trim();
        
    }
}