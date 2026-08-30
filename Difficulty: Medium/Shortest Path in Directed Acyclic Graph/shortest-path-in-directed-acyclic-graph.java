class Solution {
    public ArrayList<Integer> shortestPath(int V, int[][] edges) {
        // Code here
        
        ArrayList<ArrayList<int []>> graph = new ArrayList<>();

        for(int i =0;i<V;i++){
            graph.add(new ArrayList<>());
        }
int[] indegree = new int[V];

        for(int[] edge:edges){
            int u =edge[0];
            int v =edge[1];
            int dist=edge[2];

            graph.get(u).add(new int[]{v,dist});
            indegree[v]++;
            
        }
        
         Queue<Integer> q = new LinkedList<>();
          ArrayList<Integer> topo = new ArrayList<>();
          
          
          for(int i = 0; i < V; i++){
              if(indegree[i] == 0){
                  q.add(i);
              }
          }
        
        while(!q.isEmpty()){
            int node = q.poll();
            topo.add(node);
            
            for(int [] edge:graph.get(node)){
                int v=edge[0];
                
                indegree[v]--;
                
                if (indegree[v] == 0) {
                    q.add(v);
                }
            }
        }
        
        
        
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[0] = 0;
        
        
        for(int node :topo){
            
            if(dist[node]==Integer.MAX_VALUE){
                continue;
            }
            
            
            for(int [] edge:graph.get(node)){
                int v=edge[0];
                int wt =edge[1];
                
               if (dist[node] + wt < dist[v]) {
                   dist[v] = dist[node] + wt;
               }
               
               
            }
            
            
            
            
        }
        
        
        
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = -1;
            }
        }

       
        
        
        
        
        
         ArrayList<Integer> ans = new ArrayList<>();
         
         for(int i =0;i<V;i++){
             ans.add(dist[i]);
         }

        
        
        return ans;
        
        
        
    }
}