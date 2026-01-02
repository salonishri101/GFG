class Solution {
    
    
    
    public ArrayList<Integer> rec(ArrayList<ArrayList<Integer>> adj,int curr, ArrayList<Integer> ans,boolean vis[]) {
        // code here
      vis[curr] = true; 
       ans.add(curr);
       for(int i =0;i<adj.get(curr).size();i++){
           int neigh=adj.get(curr).get(i);
           if(!vis[neigh]){
               rec(adj,neigh,ans,vis);
           }
       }
        
       return ans; 
        
    } 
    
    
    
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        boolean vis[]= new boolean[adj.size()];
        
        return rec(adj,0,ans,vis);
        
    }
}



// 🌍 Bonus: DFS for Disconnected Graphs
// If your graph isn’t guaranteed to be connected, you should explore all components:


// public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
//     ArrayList<Integer> ans = new ArrayList<>();
//     boolean vis[] = new boolean[adj.size()];
    
//     for (int i = 0; i < adj.size(); i++) {
//         if (!vis[i]) {
//             rec(adj, i, ans, vis);
//         }
//     }
    
//     return ans;
// }
























