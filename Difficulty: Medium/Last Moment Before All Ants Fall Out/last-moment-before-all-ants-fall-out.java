class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        
        
        
        
        int maxTime=0;
       for(int i =0;i<left.length;i++){
           int time=left[i];
           maxTime=Math.max(time,maxTime);
       } 
        
        
        
               for(int i =0;i<right.length;i++){
           int time=n-right[i];
           maxTime=Math.max(time,maxTime);
       } 
        
       return maxTime; 
        
    }
}