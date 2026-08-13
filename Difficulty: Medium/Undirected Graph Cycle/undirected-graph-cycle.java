class Solution {
    
    
   public boolean dfs(int node,ArrayList<ArrayList<Integer>> graph,boolean vis[],int par){
       vis[node]=true;
       
       for(int neigh:graph.get(node)){
           if(!vis[neigh]){
              if(dfs(neigh,graph,vis,node)) {
                  return true;
              }
           }else if(vis[neigh] && neigh!=par){
               return true;
           }
       }
       
       return false;
       
   }
    
    
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            boolean vis[]=new boolean[V];
    
    
    
    
    for(int i = 0; i < V; i++){
    graph.add(new ArrayList<>());
}


    for(int i =0;i<edges.length;i++){
        int a = edges[i][0];
        int b =edges[i][1];
       graph.get(a).add(b);
       graph.get(b).add(a);
    }
    
    
    
    for(int i =0;i<V;i++){
        if(!vis[i]){
        if(dfs(i, graph, vis, -1)){
            return true;
        }
    }
    }
    
    
    return false;
        
        
        
    }
}