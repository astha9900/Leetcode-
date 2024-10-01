class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dis=new int[n+1];
        for(int i=1;i<=n;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[k]=0;
        for(int i=1;i<n;i++){
            boolean updated=false;
            for(int j=0;j<times.length;j++){
                int u=times[j][0];
                int v=times[j][1];
                int w=times[j][2];
                if (dis[u]!=Integer.MAX_VALUE && dis[u]+w<dis[v]){
                    dis[v]=dis[u]+w;
                    updated=true;
                }
            }
            if(!updated){
                break;
            }
        }
        int maxTime=0;
        for(int i=1;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE){
                return -1;
            }
            maxTime=Math.max(maxTime,dis[i]);
        }
        return maxTime;
    }
}