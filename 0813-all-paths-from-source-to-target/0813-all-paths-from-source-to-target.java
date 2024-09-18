class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> l=new ArrayList<>();
        List <Integer> path=new ArrayList<>();
        path.add(0);
        dfs(graph,0,path,l);
        return l;        
    }
    public void dfs(int [][]graph,int curr,List<Integer> path,List<List<Integer>> l){
        int target=graph.length-1;
        if(curr==target){
            l.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<graph[curr].length;i++){
            int next=graph[curr][i];
            path.add(next);
            dfs(graph,next,path,l);
            path.remove(path.size()-1);

        }
    }
}