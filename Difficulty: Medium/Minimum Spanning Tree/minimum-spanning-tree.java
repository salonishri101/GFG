class Solution {
    
    
    
    
    class Pair{
        int node;
        int wt;
        Pair(int node,int wt){
            this.node =node;
            this.wt=wt;
        }
    }
    
    
    public int spanningTree(int V, int[][] edges) {
        // code here
        int cost =0;
        
        ArrayList<ArrayList<int[]>> graph= new ArrayList<>();
        
        for(int i =0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        
        
        for(int []edge:edges){
            int u =edge[0];
            int v =edge[1];
            int wt = edge[2];
            
            graph.get(u).add(new int[]{v,wt});
            graph.get(v).add(new int[]{u,wt});
        }
        
        
        
        
        
        
        
        boolean vis[]= new boolean[V];
PriorityQueue<Pair> pq = new PriorityQueue<>(
    (a, b) -> a.wt - b.wt
);
        pq.add(new Pair(0,0));
        
        while(!pq.isEmpty()){
        Pair curr=pq.poll();
        int currNode=curr.node;
        int wt = curr.wt;
        
        if(!vis[currNode]){
            cost+=wt;
            vis[currNode]=true;
        }
        
        
        
        for(int neigh[]:graph.get(currNode)){
           if(!vis[neigh[0]]) pq.add(new Pair(neigh[0],neigh[1]));
        }
        
        }
        
        return cost;
        
    }
}
