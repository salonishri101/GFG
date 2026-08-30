class Solution {
    
    
    
    class Pair{
        int node;
        int dist;
        
        Pair(int node,int dist){
            this.node = node;
            this.dist = dist;
        
        }
    }
    
    
    
    
    public int shortestPath(int V, int[][] edges, int src, int dest) {
        // code here
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i =0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        
        
        for(int[] edge:edges){
            int a =edge[0];
            int b =edge[1];
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        
        
        int [] dist=new int[V];
        Arrays.fill(dist,-1);
        
        dist[src]=0;
        
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(src,0));
        
        while(!q.isEmpty()){
            Pair curr= q.poll();
            int currnode=curr.node;
            int currdist=curr.dist;
            
            for(int neigh:graph.get(currnode)){
                // int neighnode=neigh.node;
                // int neighdist=neigh.dist;
                
                if(dist[neigh]==-1){
                    dist[neigh]=dist[currnode]+1;
                    q.add(new Pair(neigh,dist[neigh]));
                }
            }
            
            
            
            
        }
        
        
       return dist[dest]; 
        
        
    }
}