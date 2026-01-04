class Solution {
    // Function to find number of strongly connected components in the graph.
    
    
    
    public void topSort(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int curr,Stack<Integer> s){
        vis[curr]=true;
        for(int i =0;i<adj.get(curr).size();i++){
            int neigh=adj.get(curr).get(i);
            if(!vis[neigh]){
                topSort(adj,vis,neigh,s);
            }
        }
        
        s.push(curr);
    }
    
        
    public void dfs(ArrayList<ArrayList<Integer>> revAdj,boolean[] vis,int curr){
        vis[curr]=true;
        
        for(int i =0;i<revAdj.get(curr).size();i++){
            int neigh=revAdj.get(curr).get(i);
            if(!vis[neigh]){
               dfs(revAdj,vis,neigh);
            }
        }
        
       
    }
    
    
    
    
    
    public int kosaraju(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        Stack<Integer> s = new Stack<>();
        boolean vis[]= new boolean[adj.size()];
        for(int i =0;i<adj.size();i++){
            if(!vis[i]){
                topSort(adj,vis,i,s);
            }
        }
        
        
       ArrayList<ArrayList<Integer>> revAdj= new ArrayList<>();
       
       
      for(int i =0;i<adj.size();i++){
          revAdj.add(new ArrayList<>());
      }
      
      for(int u=0;u<adj.size();u++){
          for(int v:adj.get(u)){
              revAdj.get(v).add(u);
          }
      }
    Arrays.fill(vis, false);
      int sccCount=0;
      while(!s.isEmpty()){
          int curr=s.pop();
          if(!vis[curr]){
          dfs(revAdj,vis,curr);
          sccCount++;
          }
      }
        
        
        
        
       return sccCount; 
        
        
    }
}



