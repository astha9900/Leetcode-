class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()&&st.peek()=='b'){
                if(ch=='a'){
                    st.pop();
                    count++;

                }
                else{
                    st.push(ch);
                }
            }
            else {
                st.push(ch);
            }
        }
        return count;
        
    }
}