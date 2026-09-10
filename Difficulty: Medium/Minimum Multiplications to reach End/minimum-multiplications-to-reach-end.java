class Solution {
    public int minSteps(int[] arr, int start, int end) {
        // code here
        
        int dist[] = new int[1000];
        Arrays.fill(dist,-1);
        dist[start]=0;
        
        
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        
        while(!q.isEmpty()){
            int curr=q.poll();
            
            if(curr==end){
                return dist[curr];
            }
            
            for(int a:arr){
                int neigh=(curr*a)%1000;
                if(dist[neigh]==-1){
                dist[neigh]=dist[curr]+1;
                q.add(neigh);
                }
            }
        }
        
        
        return -1;
        
    }
}