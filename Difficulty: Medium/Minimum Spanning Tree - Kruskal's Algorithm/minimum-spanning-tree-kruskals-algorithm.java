class Solution {
    
    
    static int par[];
    static int rank[];
    
    
   static void union(int u,int v){
        int pu =find(u);
        int pv =find(v);
        
        
        if(pu==pv) return;
        
        if(rank[pu]>rank[pv]){
            par[pv]=pu;
        }else  if(rank[pu]<rank[pv]){
            par[pu]=pv;
        }else{
           par[pv] = pu;
              rank[pu]++;
        }
    }
    
    static int find(int x){
        if(par[x]==x) return par[x];
        
        return par[x]=find(par[x]);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    static int kruskalsMST(int V, int[][] edges) {
        // code here
        
        
         par= new int[V];
        rank = new int[V];
        
        for(int i =0;i<V;i++){
            par[i]=i;
            rank[i]=0;        }
        
       
         Arrays.sort(edges, (a, b) -> a[2] - b[2]);
        
        int count =0;
        int cost =0;
        
        
        for(int [] edge:edges){
            int u =edge[0];
            int v =edge[1];
            int wt =edge[2];
            
            if(find(u)!=find(v)){
                union(u,v);
                count++;
                cost+=wt;
            }
            
                if (count == V - 1)
                break;
        }
        
        
            
        
        
        
        return cost;
        
    }
}







