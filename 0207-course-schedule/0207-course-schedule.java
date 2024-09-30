class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int course=prerequisites[i][0];
            int prerequisite=prerequisites[i][1];
            adj.get(prerequisite).add(course);
            indegree[course]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
        int curr=q.poll();
        count++;
        for(int i=0;i<adj.get(curr).size();i++){
            int neighbour=adj.get(curr).get(i);
            indegree[neighbour]--;
            if(indegree[neighbour]==0){
                q.offer(neighbour);
            }
        }
        }
        return count==numCourses;

    }
}