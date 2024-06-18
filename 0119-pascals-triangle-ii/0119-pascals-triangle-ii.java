class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    a.add(1);
                }
                else{
                    a.add(result.get(j-1)+result.get(j));
                }
            }
            result=a;
        }
        return result;
    }
}