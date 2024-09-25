class Solution {
    public void dfs(int curr,boolean vis[],int [][]isConnected){
        vis[curr]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[curr][i]==1&&!vis[i]){
                dfs(i,vis,isConnected);
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean vis[]=new boolean[isConnected.length];
        for(int curr=0;curr<isConnected.length;curr++){
            if(!vis[curr]){
                count++;
                dfs(curr,vis,isConnected);
            }
        }
        return count; 
    }
}