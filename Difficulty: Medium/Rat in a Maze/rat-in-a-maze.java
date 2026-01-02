class Solution {
    
    
    public void isPath(int[][] maze,int r,int c,String str,ArrayList<String> ans){
        
        if(r==maze.length-1 && c==maze.length-1){
            ans.add(new String(str));
            return;
        }
        
        if(r<0 || c<0 || r>=maze.length || c>=maze.length || maze[r][c]==0  ) return;
        
        
        maze[r][c]=0;
        isPath(maze,r+1,c,str+"D",ans);
        isPath(maze,r,c-1,str+"L",ans);
        isPath(maze,r,c+1,str+"R",ans);
        isPath(maze,r-1,c,str+"U",ans);
        maze[r][c]=1;
        
    }
    
    
    
    
    
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        isPath(maze,0,0,"",ans);
        
        return ans;
        
        
    }
}