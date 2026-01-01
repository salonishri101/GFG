class Solution {
    
    
    
    class Pair{
        int node;
        int dist;
        
        Pair( int node,int dist){
            this.node = node;
            this.dist=dist;
        }
    }
    
    
    
    
    
    public int[] dijkstra(int V, int[][] edges, int src) {
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i =0;i<V;i++){
            adj.add( new ArrayList<>());
        }
        
        for(int[] e:edges){
            int a =e[0];
            int b=e[1];
            int w=e[2];
            adj.get(a).add(new Pair(b,w));
            adj.get(b).add(new Pair(a,w));//undirected
            
        }
        
        
        int [] dist= new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        dist[src]=0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
        pq.add(new Pair(src,0));
        
        
         //Dijkstra
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            int node = curr.node;
            int currDist=curr.dist;
            
            if (currDist > dist[node]) continue;
            
            
            for(int i =0;i<adj.get(node).size();i++){
                Pair neigh = adj.get(node).get(i);
                int neighNode=neigh.node;
                int weight=neigh.dist;
                
                
                if(dist[node]+weight<dist[neighNode]){
                    dist[neighNode]=dist[node]+weight;
                    pq.add(new Pair(neighNode,dist[neighNode]));
                }
            }
            
        }
        
        return dist;
        
        
        // code here
        
    }
}