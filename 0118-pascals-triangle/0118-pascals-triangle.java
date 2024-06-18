class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> b=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    b.add(1);
                }
                else{
                    int val=a.get(i-1).get(j-1)+a.get(i-1).get(j);
                    b.add(val);
                }
            }
            a.add(b);
        }
        return a;
        
    }
}