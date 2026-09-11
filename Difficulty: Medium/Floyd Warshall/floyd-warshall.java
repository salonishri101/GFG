class Solution {
    public void floydWarshall(int[][] dist) {
        // Code here
        
        
        int INF = 100000000;
        
        for(int k=0;k<dist.length;k++){
            for(int i =0;i<dist.length;i++){
                for(int j =0;j<dist.length;j++){
                    
                     if (dist[i][k] != INF && dist[k][j] != INF) {
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                     }
                }
            }
        }
        
        
        
    }
}