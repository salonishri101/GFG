class Solution {
    public ArrayList<Integer> bellmanFord(int V, int[][] edges, int src) {
        // code here
        
        int [] dist= new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        
        
      
        
        
        
        for(int i =0;i<V-1;i++){
            
                for(int[] e:edges){
                    int u =e[0];
                    int v =e[1];
                    int wt=e[2];
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            
        }
        
        
          for(int[] e : edges){

            int u = e[0];
            int v = e[1];
            int wt = e[2];

            if(dist[u] != Integer.MAX_VALUE &&
               dist[u] + wt < dist[v]){
                return new ArrayList<>(Arrays.asList(-1));
            }
        }
        
        
         for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = 100000000;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i =0;i<V;i++){
            ans.add(dist[i]);
        }
        
        return ans;
        
    }
}
