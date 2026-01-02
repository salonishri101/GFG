class Solution {
    
    
    
    
    
    public void topSortUtil(ArrayList<ArrayList<Integer>> adj, boolean vis[],int curr, Stack< Integer> s){
        vis[curr]=true;
        
        for(int i =0;i<adj.get(curr).size();i++){
            int neigh = adj.get(curr).get(i);
            if(!vis[neigh]){
                topSortUtil(adj,vis,neigh,s);
            }
            
        }
        
        s.push(curr);
        
    }
    
    
    
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
         ArrayList<Integer> ans = new ArrayList<>();
         boolean vis[] =new boolean[V];
         Stack< Integer> s= new Stack<>();
         
         for(int i =0; i<V;i++){
             adj.add(new ArrayList<>());
         }
         
         
         
         for(int[] edge:edges){
             int a=edge[0];
             int b =edge[1];
             
             adj.get(a).add(b);

         }
         
         for(int i =0;i<V;i++){
             if(!vis[i]){
            topSortUtil(adj,vis,i,s);
         }
        
         }
        // code here
        
        
        while(!s.isEmpty()){
            ans.add(s.pop());
        }
       return ans;
        
    }
}