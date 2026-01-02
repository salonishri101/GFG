class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q= new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[]= new boolean[adj.size()];
        
        q.add(0);
        vis[0]=true;

        while(!q.isEmpty()){
            int curr=q.remove();
                ans.add(curr);
            for(int i =0;i<adj.get(curr).size();i++){
                int neigh=adj.get(curr).get(i);
                if(!vis[neigh]){
                vis[neigh]=true;
                q.add(neigh);
            }
            
            } 
        }
        return ans;
    }
}



// class Solution {
    
    
    
    
//       public void rec(ArrayList<ArrayList<Integer>> adj,boolean vis[],ArrayList<Integer> ans)  {
//           Queue<Integer> q= new LinkedList<>();
//             q.add(0);
//         vis[0]=true;

//         while(!q.isEmpty()){
//             int curr=q.remove();
//                 ans.add(curr);
//             for(int i =0;i<adj.get(curr).size();i++){
//                 int neigh=adj.get(curr).get(i);
//                 if(!vis[neigh]){
//                 vis[neigh]=true;
//                 q.add(neigh);
//             }
            
//             } 
//         }
        
        
       
//       }
    
    
//     public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
//         // code here
        
//         ArrayList<Integer> ans = new ArrayList<>();
//         boolean vis[]= new boolean[adj.size()];
        
        
        
//              for (int i = 0; i < adj.size(); i++) {
//         if (!vis[i]) {
//             rec(adj,vis,ans);
//         }
//     }
        
      
//         return ans;
//     }
// }





