class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dis=new int[n];
        for(int i=0;i<n;i++){
           // dis[0]=0;
            if(i!=src){
                dis[i]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<k+1;i++){
            int[] tempdis=dis.clone();
            for(int j=0;j<flights.length;j++){
                int u=flights[j][0];
                int v=flights[j][1]; 
                int cost=flights[j][2]; 
                if (dis[u]!=Integer.MAX_VALUE && dis[u]+cost<tempdis[v]){
                    tempdis[v]=dis[u]+cost; 
                }
            }
            dis=tempdis; 
        }
        return dis[dst]==Integer.MAX_VALUE ? -1 : dis[dst];
    }
}